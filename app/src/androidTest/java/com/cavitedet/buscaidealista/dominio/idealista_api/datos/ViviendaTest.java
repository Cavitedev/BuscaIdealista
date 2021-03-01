package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

import android.os.Parcel;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class ViviendaTest {

    //No funciona

//    @Test
//    public void ParcelSerializarDeserializar(){
//        Vivienda vivienda = new Vivienda();
//        vivienda.setThumbnail("https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg");
//        vivienda.setUrl("https://www.idealista.com/inmueble/40013150/");
//        vivienda.setAddress("San Pablo - Santa Teresa");
//        vivienda.setLatitude(38.9885703);
//        vivienda.setLongitude(-1.8693012);
//        vivienda.setSize(257.0);
//        Parcel parcel = Parcel.obtain();
//        vivienda.writeToParcel(parcel,0);
//        assertEquals(vivienda, new Vivienda(parcel));
//    }

    @Test
    public void cargarBitmapDesdeThumbail() {
        String url = "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/17/65/23/698059991.jpg";
        Vivienda vivienda = new Vivienda();
        vivienda.setThumbnail(url);
        vivienda.cargarBitmapDesdeThumbail();
        assertNotNull(vivienda.getThumbnailBitmap());
    }
}