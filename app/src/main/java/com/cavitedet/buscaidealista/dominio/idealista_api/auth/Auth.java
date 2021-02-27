package com.cavitedet.buscaidealista.dominio.idealista_api.auth;

import com.cavitedet.buscaidealista.BuildConfig;

import java.util.Date;

public class Auth {

    private String authKey;
    private Date expirationDate;

    public Auth(String authKey, Date expirationDate) {
        this.authKey = authKey;
        this.expirationDate = expirationDate;
    }



}
