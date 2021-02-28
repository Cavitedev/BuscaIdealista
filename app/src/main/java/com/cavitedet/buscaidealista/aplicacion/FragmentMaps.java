package com.cavitedet.buscaidealista.aplicacion;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.app.ActivityCompat;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.fake.FakeIdealistaRepositorio;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class FragmentMaps extends SupportMapFragment implements OnMapReadyCallback {

    private boolean camaraPosicionada = false;
    private GoogleMap googleMap;
    IIdealistaRepositorio idealistaRepositorio = new FakeIdealistaRepositorio();

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = super.onCreateView(layoutInflater, viewGroup, bundle);

        getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.getUiSettings().setZoomControlsEnabled(true);

    }


    public void updateCoordinates(double lat, double lon) {
        LatLng latLng = new LatLng(lat, lon);
        if (!camaraPosicionada) {
            moverCamara(latLng);
        }
        try {
            //TODO: File not found exception
            googleMap.clear();
            List<Vivienda> viviendaList = idealistaRepositorio.getViviendas(lat, lon, 100, VentaAlquiler.VENTA);
            for (Vivienda vivienda : viviendaList) {
                googleMap.addMarker(new MarkerOptions().position(new LatLng(vivienda.getLatitude(), vivienda.getLongitude())));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LlamadaHttpException e) {
            e.printStackTrace();
        }
//        googleMap.clear();
//        googleMap.addMarker(new MarkerOptions().position(latLng));
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