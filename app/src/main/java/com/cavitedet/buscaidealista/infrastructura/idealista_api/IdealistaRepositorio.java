package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import java.io.IOException;
import java.util.List;

public class IdealistaRepositorio implements IIdealistaRepositorio {

    private LlamadorApi llamadorApi = LlamadorApi.getInstance();


    @Override
    public List<Vivienda> getViviendas(double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {
        return null;
    }
}
