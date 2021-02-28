package com.cavitedev.buscaidealista.infrastructura;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class FakeIdealistaRepositorio implements IIdealistaRepositorio {




    @Override
    public List<Vivienda> getViviendas(double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {


        return null;
    }






}
