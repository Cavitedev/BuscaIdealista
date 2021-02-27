package com.cavitedet.buscaidealista.infrastructura.idealista_api.auth;

import com.cavitedet.buscaidealista.BuildConfig;
import com.cavitedet.buscaidealista.dominio.idealista_api.auth.ILlamadorAuth;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadorHttp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LlamadorAuth implements ILlamadorAuth {



    @Override
    public String refrescarAuth() throws IOException, LlamadaHttpException {
        String uri = "https://jsonplaceholder.typicode.com/todos/1?=";
        Map<String, String> headers = new HashMap<>();
        String auth = BuildConfig.IDEALISTA_AUTH;
        headers.put("Authorization", auth);
        headers.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8\"");
        String body = "-----011000010111000001101001\r\nContent-Disposition: form-data; name=\"grant_type\"\r\n\r\nclient_credentials\r\n-----011000010111000001101001--\r\n";

        return LlamadorHttp.getInstance().callPost(uri, headers, body);
    }
}
