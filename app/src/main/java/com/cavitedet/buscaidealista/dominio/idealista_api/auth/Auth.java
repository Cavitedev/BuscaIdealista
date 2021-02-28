package com.cavitedet.buscaidealista.dominio.idealista_api.auth;

import android.content.Context;
import android.content.SharedPreferences;

import com.cavitedet.buscaidealista.R;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class Auth {



    private String accessToken;
    private Date expirationDate;

    public Auth(String accessToken, Date expirationDate) {
        this.accessToken = accessToken;
        this.expirationDate = expirationDate;
    }


    public static Auth desdeJson(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String,Object> jsonMap = objectMapper.readValue(json, Map.class);
            String accessToken = (String) jsonMap.get("access_token");
            int secondsToExpire = (int) jsonMap.get("expires_in");
            Date expirationDate = new Date(Calendar.getInstance().getTimeInMillis() + secondsToExpire * 1000);
            return new Auth(accessToken,expirationDate);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean haExpirado(){
        return Calendar.getInstance().getTime().after(expirationDate);
    }

    public void guardarPreferencias(Context context){
        SharedPreferences preferences = context.getSharedPreferences(context.getString(R.string.preferencias),
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("token",accessToken);
        editor.putLong("token_expiracion",expirationDate.getTime());
        editor.apply();
    }

    public static Auth cargarDesdePreferencias(Context context){
        SharedPreferences preferences = context.getSharedPreferences(context.getString(R.string.preferencias),
                Context.MODE_PRIVATE);
        String token= preferences.getString("token","");
        if(token.isEmpty()) return null;
        Date caducidad = new Date(preferences.getLong("token_expiracion",0));
        return new Auth(token,caducidad);
    }
}
