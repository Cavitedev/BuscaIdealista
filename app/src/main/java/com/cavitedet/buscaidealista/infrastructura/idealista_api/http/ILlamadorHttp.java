package com.cavitedet.buscaidealista.infrastructura.idealista_api.http;

import android.graphics.Bitmap;

import java.io.IOException;
import java.util.Map;

public interface ILlamadorHttp {


    String callPost(String uri, Map<String, String> headerMap, String bodyStr) throws IOException, LlamadaHttpException;

    Bitmap descargarImagen(String url) throws IOException;

}
