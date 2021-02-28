package com.cavitedet.buscaidealista.aplicacion;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.app.ActivityCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class FragmentMaps extends SupportMapFragment implements OnMapReadyCallback {

    private boolean camaraPosicionada = false;
    private GoogleMap googleMap;

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
//        googleMap.clear();
//        googleMap.addMarker(new MarkerOptions().position(latLng));
    }

    public void moverCamara(LatLng latLng) {
        camaraPosicionada = true;
        float zoom = 17;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));

        //Debe tener permisos ya concedidos
        if (googleMap.isMyLocationEnabled() && getContext() != null &&
                (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                        || ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)) {
            googleMap.setMyLocationEnabled(true);
        }
    }


}