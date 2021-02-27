package com.cavitedet.buscaidealista.infrastructura.idealista_api.auth;

import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class LlamadorAuthTest {


    //Expensive Call 💰. Uncomment to use it
    @Test
    public void llamarAuth() throws IOException, LlamadaHttpException {
        String auth = LlamadorAuth.getInstance().llamarAuth();
        assertNotNull(auth);
    }
}