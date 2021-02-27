package com.cavitedet.buscaidealista.dominio.idealista_api.auth;

import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import java.io.IOException;

public interface ILlamadorAuth {


    /**
     *
     * @return Body of the request
     * @throws IOException connectivity problem or timeout
     * @throws LlamadaHttpException Not 200 http code exception
     */
    String llamarAuth() throws IOException, LlamadaHttpException;

}
