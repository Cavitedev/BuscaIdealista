package com.cavitedet.buscaidealista.dominio.idealista_api.auth;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class AuthTest {


    @Test
    public void createAuthTestFromJsonString() {
        String response = "{\n" +
                "  \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJyZWFkIl0sImV4cCI6MTYxNDQ2OTM2OCwiYXV0aG9yaXRpZXMiOlsiUk9MRV9QVUJMSUMiXSwianRpIjoiNDY5ZGVmYzYtZjJjZi00MWQzLWIwZDQtZGYyOTAyYzc4MDRiIiwiY2xpZW50X2lkIjoic2p1MDloa3J1Mzh0ZWJjdWliM3NwbHU0OW1xYW16OGQifQ.n0JriM7T9PmnDfMLAyisBACxw0Lq8yAM6alsgg8nmYM\",\n" +
                "  \"token_type\": \"bearer\",\n" +
                "  \"expires_in\": 43200,\n" +
                "  \"scope\": \"read\",\n" +
                "  \"jti\": \"469defc6-f2cf-41d3-b0d4-df2902c7804b\"\n" +
                "}";
        Auth auth = new Auth(response);
        Date time = new Date(Calendar.getInstance().getTimeInMillis() + 43200000);
         assertNotNull(auth.getAccessToken());
        assertEquals(time,auth.getExpirationDate());
    }

}