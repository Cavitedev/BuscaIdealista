package com.cavitedet.buscaidealista.infrastructura.idealista_api.fake;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class FakeIdealistaRepositorioTest {

    @Test
    public void getViviendas() throws IOException, LlamadaHttpException {

        IIdealistaRepositorio iIdealistaRepositorio = new FakeIdealistaRepositorio();
        //Datos aleatorios
        List<Vivienda> viviendaList = iIdealistaRepositorio.getViviendas(1,2,3, VentaAlquiler.VENTA);
        assertNotNull(viviendaList);
        assertEquals(7,viviendaList.size());
        Vivienda vivienda = viviendaList.get(0);
        assert vivienda != null;
        assertEquals("https://www.idealista.com/inmueble/40013150/",vivienda.getUrl());
        assertEquals("https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg",vivienda.getThumbnail());
        assertEquals(38.9885703,vivienda.getLatitude(), 0.01);
        assertEquals(-1.8693012,vivienda.getLongitude(), 0.01);
        assertEquals(380000.0,vivienda.getPrice(), 0.01);
        assertEquals(257.0,vivienda.getSize(), 0.01);
        assertEquals("San Pablo - Santa Teresa",vivienda.getAddress());
    }
}