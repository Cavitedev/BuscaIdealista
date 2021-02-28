package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class ViviendaTest {

    @Test
    public void cargarBitmapDesdeThumbail() {
        String url = "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/17/65/23/698059991.jpg";
        Vivienda vivienda = new Vivienda();
        vivienda.setThumbnail(url);
        vivienda.cargarBitmapDesdeThumbail();
        assertNotNull(vivienda.getThumbnailBitmap());
    }
}