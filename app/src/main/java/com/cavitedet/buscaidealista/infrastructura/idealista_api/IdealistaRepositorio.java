package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import android.content.Context;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.auth.Auth;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class IdealistaRepositorio implements IIdealistaRepositorio {

    private LlamadorApi llamadorApi = LlamadorApi.getInstance();
    private Auth auth;

    private Context context;

    public IdealistaRepositorio(Context context) {
        this.context = context;
        auth = Auth.cargarDesdePreferencias(context);
    }

    @Override
    public List<Vivienda> getViviendas(double lat, double lon, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {

        if(auth == null || auth.haExpirado()){
            auth = Auth.desdeJson(llamadorApi.llamarAuth());
            auth.guardarPreferencias(context);
        }
        // Hay menos Alquieres que compras
        if(ventaAlquiler == VentaAlquiler.ALQUILER){
            distanciaMetros *=5;
        }
        String respuesta = llamadorApi.getViviendas(auth.getAccessToken(), lat, lon, distanciaMetros, ventaAlquiler);
        try {
            JSONObject jsonObject = new JSONObject(respuesta);
            String viviendasStr =  jsonObject.get("elementList").toString();
            return Vivienda.fromJsonList(viviendasStr);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }
}
