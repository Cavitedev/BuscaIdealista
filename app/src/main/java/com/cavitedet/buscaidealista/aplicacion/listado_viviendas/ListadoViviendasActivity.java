package com.cavitedet.buscaidealista.aplicacion.listado_viviendas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
        setContentView(R.layout.listado_viviendas_activity);
        viviendas =  getIntent().getParcelableArrayListExtra(Constantes.VIVIENDA_INTENT);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_viviendas);
        ViviendaAdapter viviendaAdapter = new ViviendaAdapter(this,viviendas);
        recyclerView.setAdapter(viviendaAdapter);
    }
}