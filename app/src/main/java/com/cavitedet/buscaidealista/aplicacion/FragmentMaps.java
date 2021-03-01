package com.cavitedet.buscaidealista.aplicacion;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
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

    private double lat, lon;
    private VentaAlquiler ventaAlquiler = VentaAlquiler.VENTA;

    private Handler handler;


    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
//        idealistaRepositorio = new IdealistaRepositorio(getContext());
        idealistaRepositorio = new FakeIdealistaRepositorio();
        View rootView = super.onCreateView(layoutInflater, viewGroup, bundle);

        handler = HandlerCompat.createAsync(Looper.getMainLooper());
        getMapAsync(this);

        return rootView;
    }

    public List<Vivienda> getViviendaList() {
        return viviendaList;
    }

    public VentaAlquiler getVentaAlquiler() {
        return ventaAlquiler;
    }

    public void setVentaAlquiler(VentaAlquiler ventaAlquiler) {
        this.ventaAlquiler = ventaAlquiler;
        updateCoordinates(lat, lon);
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
                        TextView direccion = v.findViewById(R.id.direccion);
                        TextView espacio = v.findViewById(R.id.espacio);
                        TextView precio = v.findViewById(R.id.precio);
                        ImageView imagenMiniatura = v.findViewById(R.id.miniatura_imagen);
                        if (vivienda.getThumbnailBitmap() != null) {
                            imagenMiniatura.setImageBitmap(vivienda.getThumbnailBitmap());
                        }
                        direccion.setText(getString(R.string.direccion, vivienda.getAddress()) );
                        espacio.setText(getString(R.string.espacio, String.valueOf(vivienda.getSize())) );
                        precio.setText(getString(R.string.precio, String.valueOf(vivienda.getPrice())) );

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
        this.lat = lat;
        this.lat = lon;
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
                        viviendaList = idealistaRepositorio.getViviendas
                                (lat, lon, 300, ventaAlquiler);
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