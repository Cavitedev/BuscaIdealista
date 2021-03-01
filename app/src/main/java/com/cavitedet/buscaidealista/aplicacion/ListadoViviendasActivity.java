package com.cavitedet.buscaidealista.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cavitedet.buscaidealista.R;
import com.cavitedet.buscaidealista.core.Constantes;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;

public class ListadoViviendasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vivienda[] viviendas = (Vivienda[]) getIntent().getParcelableArrayExtra(Constantes.VIVIENDA_INTENT);
        setContentView(R.layout.listado_viviendas_activity);
    }
}