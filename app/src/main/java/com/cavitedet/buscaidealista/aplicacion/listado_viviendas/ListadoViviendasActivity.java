package com.cavitedet.buscaidealista.aplicacion.listado_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cavitedet.buscaidealista.R;
import com.cavitedet.buscaidealista.core.Constantes;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;

import java.util.ArrayList;
import java.util.List;

public class ListadoViviendasActivity extends AppCompatActivity {

    List<Vivienda> viviendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viviendas =  getIntent().getParcelableArrayListExtra(Constantes.VIVIENDA_INTENT);
        setContentView(R.layout.listado_viviendas_activity);
    }
}