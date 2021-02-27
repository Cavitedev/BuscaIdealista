package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import com.cavitedet.buscaidealista.dominio.idealista_api.ILlamadorApi;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadorHttp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LlamadorApi implements ILlamadorApi {

    private static LlamadorApi instance;

    public static LlamadorApi getInstance() {
        if (instance == null) {
            instance = new LlamadorApi();
        }
        return instance;
    }

    @Override
    public String getViviendas(double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) {
        return null;
    }



}
