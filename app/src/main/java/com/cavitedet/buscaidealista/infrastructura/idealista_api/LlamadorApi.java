package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import com.cavitedet.buscaidealista.dominio.idealista_api.ILlamadorApi;
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
    public String getViviendas(String auth, double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {

        String uri = "https://api.idealista.com/3.5/es/search?center="+lon+"%2C"+lat+"&distance="+
                distanciaMetros+"&operation="
                + VentaAlquilerUtil.getNombreApiVentaAlquiler(ventaAlquiler)
                +"&propertyType=homes";

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization","Bearer "+auth);

        return LlamadorHttp.getInstance().callPost(uri,headers,"");

    }



}
