package com.cavitedet.buscaidealista.aplicacion;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cavitedet.buscaidealista.R;

public class MainActivity extends AppCompatActivity {

    private static final long MIN_UPDATE_TIME = 10000; // 10 segundos
    FragmentMaps fragmentMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        fragmentMaps = new FragmentMaps();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.map, fragmentMaps, null);
        transaction.commit();


        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new
                    String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
        } else {
            iniciarLocalizacion();
        }
    }

    private void iniciarLocalizacion() {
        LocationManager locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);
        Localizacion local = new Localizacion();
        local.setMainActivity(this, fragmentMaps);
        final boolean gpsEnabled =
                locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (!gpsEnabled) {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(intent);
        }
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new
                    String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.PASSIVE_PROVIDER,
                MIN_UPDATE_TIME, 0, local);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                MIN_UPDATE_TIME, 0, local);
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == 1000) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                iniciarLocalizacion();
            }
        }
    }
}