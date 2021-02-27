package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import com.cavitedet.buscaidealista.BuildConfig;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquilerUtil;
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
    public String llamarAuth() throws IOException, LlamadaHttpException {
        String uri = "https://api.idealista.com/oauth/token?=";
        Map<String, String> headers = new HashMap<>();
        String auth = BuildConfig.IDEALISTA_AUTH;
        headers.put("Authorization", "Basic " + auth);
        headers.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8\"");
        String body = "-----011000010111000001101001\r\nContent-Disposition: form-data; name=\"grant_type\"\r\n\r\nclient_credentials\r\n-----011000010111000001101001--\r\n";

        return LlamadorHttp.getInstance().callPost(uri, headers, body);
    }

    @Override
    public String getViviendas(String token, double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {

        String uri = "https://api.idealista.com/3.5/es/search?center="+lon+"%2C"+lat+"&distance="+
                distanciaMetros+"&operation="
                + VentaAlquilerUtil.getNombreApiVentaAlquiler(ventaAlquiler)
                +"&propertyType=homes";

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization","Bearer "+token);

        return LlamadorHttp.getInstance().callPost(uri,headers,"");

    }



}
