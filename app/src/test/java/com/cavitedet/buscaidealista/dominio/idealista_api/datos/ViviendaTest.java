package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ViviendaTest {

    @Test
    public void fromJson() {

        String json = " {\n" +
                "      \"propertyCode\": \"40013150\",\n" +
                "      \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg\",\n" +
                "      \"externalReference\": \"40243\",\n" +
                "      \"numPhotos\": 13,\n" +
                "      \"floor\": \"bj\",\n" +
                "      \"price\": 380000.0,\n" +
                "      \"propertyType\": \"chalet\",\n" +
                "      \"operation\": \"sale\",\n" +
                "      \"size\": 257.0,\n" +
                "      \"exterior\": false,\n" +
                "      \"rooms\": 3,\n" +
                "      \"bathrooms\": 3,\n" +
                "      \"address\": \"San Pablo - Santa Teresa\",\n" +
                "      \"province\": \"Albacete\",\n" +
                "      \"municipality\": \"Albacete\",\n" +
                "      \"district\": \"San Pablo - Santa Teresa\",\n" +
                "      \"country\": \"es\",\n" +
                "      \"latitude\": 38.9885703,\n" +
                "      \"longitude\": -1.8693012,\n" +
                "      \"showAddress\": false,\n" +
                "      \"url\": \"https://www.idealista.com/inmueble/40013150/\",\n" +
                "      \"distance\": \"34\",\n" +
                "      \"hasVideo\": false,\n" +
                "      \"status\": \"good\",\n" +
                "      \"newDevelopment\": false,\n" +
                "      \"parkingSpace\": {\n" +
                "        \"hasParkingSpace\": true,\n" +
                "        \"isParkingSpaceIncludedInPrice\": true\n" +
                "      },\n" +
                "      \"priceByArea\": 1479.0,\n" +
                "      \"detailedType\": {\n" +
                "        \"typology\": \"chalet\",\n" +
                "        \"subTypology\": \"terracedHouse\"\n" +
                "      },\n" +
                "      \"suggestedTexts\": {\n" +
                "        \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
                "        \"title\": \"Chalet adosado\"\n" +
                "      },\n" +
                "      \"hasPlan\": false,\n" +
                "      \"has3DTour\": false,\n" +
                "      \"has360\": false,\n" +
                "      \"hasStaging\": false,\n" +
                "      \"topNewDevelopment\": false\n" +
                "    }";

        Vivienda vivienda = Vivienda.fromJson(json);
        assert vivienda != null;
        assertEquals("https://www.idealista.com/inmueble/40013150/",vivienda.getUrl());
        assertEquals("https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg",vivienda.getThumbnail());
        assertEquals(38.9885703,vivienda.getLatitude(), 0.01);
        assertEquals(-1.8693012,vivienda.getLongitude(), 0.01);
        assertEquals(380000.0,vivienda.getPrice(), 0.01);
        assertEquals(257.0,vivienda.getSize(), 0.01);
        assertEquals("San Pablo - Santa Teresa",vivienda.getAddress());

    }

    @Test
    public void fromJsonList() throws FileNotFoundException {
        // path may change over time
        File jsonFile = new File("../app/src/testShared/java/com/cavitedev.buscaidealista.infrastructura/ejViviendas.json");
        BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
        String json = reader.lines().collect(Collectors.joining());
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Vivienda> viviendaList = Vivienda.fromJsonList(json);
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