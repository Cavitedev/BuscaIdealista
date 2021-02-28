package com.cavitedev.buscaidealista.infrastructura;

import com.cavitedet.buscaidealista.dominio.idealista_api.IIdealistaRepositorio;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.VentaAlquiler;
import com.cavitedet.buscaidealista.dominio.idealista_api.datos.Vivienda;
import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadaHttpException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FakeIdealistaRepositorio implements IIdealistaRepositorio {




    @Override
    public List<Vivienda> getViviendas(double lon, double lat, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {

        File jsonFile = new File("../app/src/testShared/java/com/cavitedev.buscaidealista.infrastructura/ejViviendas.json");
        BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
        String json = reader.lines().collect(Collectors.joining());
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Vivienda.fromJsonList(json);
    }






}
