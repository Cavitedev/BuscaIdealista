package com.cavitedet.buscaidealista.infrastructura.idealista_api.http;

public class LlamadaHttpException extends Exception {
    private final int code;

    public LlamadaHttpException(int code, String message) {
        super(message);
        this.code = code;
    }
}
