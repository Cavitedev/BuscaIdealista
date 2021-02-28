package com.cavitedet.buscaidealista.infrastructura.idealista_api.http;

import android.graphics.Bitmap;

import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class LlamadorHttpTest {

    @Test
    public void descargarImagen() throws IOException {

        String url = "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/17/65/23/698059991.jpg";
        Bitmap bitmap = LlamadorHttp.getInstance().descargarImagen(url);
        assertNotNull(bitmap);

    }
}