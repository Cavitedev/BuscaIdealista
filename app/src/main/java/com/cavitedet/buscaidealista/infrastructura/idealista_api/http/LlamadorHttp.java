package com.cavitedet.buscaidealista.infrastructura.idealista_api.http;


import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.Map;

public class LlamadorHttp implements ILlamadorHttp {

    private static LlamadorHttp instance;
    private OkHttpClient client;

    public static LlamadorHttp getInstance() {
        if (instance == null) {
            instance = new LlamadorHttp();
        }
        return instance;
    }

    public LlamadorHttp() {
        client = new OkHttpClient();
    }

    /**
     * @return Body of the post request
     * @throws IOException          connectivity problem or timeout
     * @throws LlamadaHttpException Not 200 http code exception
     */
    public String callPost(String uri, Map<String, String> headerMap, String bodyStr) throws IOException, LlamadaHttpException {
        if(bodyStr == null)
            bodyStr = "";

        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=---011000010111000001101001");
        RequestBody body = RequestBody.create(mediaType, bodyStr);


        Request.Builder requestBuilder = new Request.Builder()
                .url(uri)
                .post(body);
        for (Map.Entry<String, String> header : headerMap.entrySet()) {
            requestBuilder = requestBuilder.addHeader(header.getKey(), header.getValue());
        }

        Request request = requestBuilder.build();

        Response response = client.newCall(request).execute();

        if (response.code() != 200) {
            throw new LlamadaHttpException(response.code(), response.body().string());
        }
        return response.body().string();

    }

}

