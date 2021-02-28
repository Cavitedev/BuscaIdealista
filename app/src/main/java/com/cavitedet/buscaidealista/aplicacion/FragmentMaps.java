package com.cavitedet.buscaidealista.aplicacion;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.os.HandlerCompat;

import com.cavitedet.buscaidealista.R;
import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.IdealistaRepositorio;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.fake.FakeIdealistaRepositorio;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FragmentMaps extends SupportMapFragment implements OnMapReadyCallback {

    private boolean camaraPosicionada = false;
    private GoogleMap googleMap;
    IIdealistaRepositorio idealistaRepositorio;
    List<Vivienda> viviendaList;

    private Handler handler;


    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        idealistaRepositorio = new IdealistaRepositorio(getContext());
        View rootView = super.onCreateView(layoutInflater, viewGroup, bundle);

        handler = HandlerCompat.createAsync(Looper.getMainLooper());
        getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.getUiSettings().setZoomControlsEnabled(true);


        googleMap.setOnInfoWindowClickListener(marker -> {
            Intent paginaWebIntent = new Intent(Intent.ACTION_VIEW);
            paginaWebIntent.setData(Uri.parse(marker.getTitle()));
            startActivity(paginaWebIntent);
        });

        googleMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                for (Vivienda vivienda : viviendaList) {
                    if (vivienda.getUrl().equals(marker.getTitle())) {
                        View v = getLayoutInflater().inflate(R.layout.vivienda_desplegable, null);
                        TextView titulo = v.findViewById(R.id.titulo);
                        TextView direccion = v.findViewById(R.id.direccion);
                        ImageView imagenMiniatura = v.findViewById(R.id.miniatura_imagen);
                        if (vivienda.getThumbnailBitmap() != null) {
                            imagenMiniatura.setImageBitmap(vivienda.getThumbnailBitmap());
                        }
                        titulo.setText(marker.getTitle());
                        direccion.setText(vivienda.getAddress());

                        return v;
                    }
                }
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                return null;
            }
        });


    }


    public void updateCoordinates(double lat, double lon) {
        LatLng latLng = new LatLng(lat, lon);
        if (!camaraPosicionada) {
            moverCamara(latLng);
        }

            googleMap.clear();

        Executor executor = Executors.newFixedThreadPool(1);
            executor.execute(new Runnable(){
                @Override
                public void run() {
                    try {
                        viviendaList = idealistaRepositorio.getViviendas(lat, lon, 100, VentaAlquiler.VENTA);
                        anadirViviendasMapa(viviendaList);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (LlamadaHttpException e) {
                        e.printStackTrace();
                    }
                }
            });


    }

    public void anadirViviendasMapa(List<Vivienda> viviendaList){
        handler.post(new Runnable() {
            @Override
            public void run() {
                for (Vivienda vivienda : viviendaList) {
                    MarkerOptions marker = new MarkerOptions().position(new LatLng(vivienda.getLatitude(), vivienda.getLongitude()));
                    marker.title(vivienda.getUrl());
                    googleMap.addMarker(marker);
                }
            }
        });
    }

    public void moverCamara(LatLng latLng) {
        camaraPosicionada = true;
        float zoom = 17;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));

        //Debe tener permisos ya concedidos
        if (!googleMap.isMyLocationEnabled() && getContext() != null &&
                (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                        || ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)) {
            googleMap.setMyLocationEnabled(true);
        }
    }


}