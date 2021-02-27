package com.cavitedet.buscaidealista.dominio.idealista_api;

import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import java.io.IOException;

public interface ILlamadorApi {

    /**
     * @return Body of the request
     * @throws IOException connectivity problem or timeout
     * @throws LlamadaHttpException Not 200 http code exception
     */
    String getViviendas(double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException;



}
