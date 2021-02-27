package com.cavitedet.buscaidealista.dominio.idealista_api.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class Auth {



    private String accessToken;
    private Date expirationDate;

    //Throws some exceptions if input is not valid
    public Auth(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String,Object> jsonMap = objectMapper.readValue(json, Map.class);
            accessToken = (String) jsonMap.get("access_token");
            int secondsToExpire = (int) jsonMap.get("expires_in");
            expirationDate = new Date(Calendar.getInstance().getTimeInMillis() + secondsToExpire * 1000);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    public String getAccessToken() {
        return accessToken;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
