package com.cavitedet.buscaidealista.aplicacion;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cavitedet.buscaidealista.R;

public class Localizacion implements LocationListener {

    MainActivity mainActivity;
    FragmentMaps fragmentMaps;

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity, FragmentMaps fragmentMaps) {
        this.mainActivity = mainActivity;
        this.fragmentMaps = fragmentMaps;
    }


    @Override
    public void onLocationChanged(@NonNull Location location) {

        mapa(location.getLatitude(), location.getLongitude());
    }

    public void mapa(double lat, double lon) {
        fragmentMaps.updateCoordinates(lat, lon);

    }

}