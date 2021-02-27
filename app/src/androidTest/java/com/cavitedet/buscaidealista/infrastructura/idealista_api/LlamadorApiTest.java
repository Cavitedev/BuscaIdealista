package com.cavitedet.buscaidealista.infrastructura.idealista_api;

import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class LlamadorApiTest {


    //Llamada cara 💰
//    @Test
//    public void getViviendas() throws IOException, LlamadaHttpException {
//        // Cambiar auth cada vez que se ejecuta
//        String auth = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJyZWFkIl0sImV4cCI6MTYxNDQ2NjgxNywiYXV0aG9yaXRpZXMiOlsiUk9MRV9QVUJMSUMiXSwianRpIjoiMDk0MmJmMzEtYmUwYS00YjBkLWE4YTUtYzgwZWVjMTY5OTA5IiwiY2xpZW50X2lkIjoic2p1MDloa3J1Mzh0ZWJjdWliM3NwbHU0OW1xYW16OGQifQ.-otmHjrnXgoFpHLNVtaagqBC5TQRowsgZYjTj2qFdgk";
//        String viviendas = LlamadorApi.getInstance().getViviendas(auth, 38.9887075, -1.8696583, 100, VentaAlquiler.VENTA);
//        Assert.assertNotNull(viviendas);
//    }


}