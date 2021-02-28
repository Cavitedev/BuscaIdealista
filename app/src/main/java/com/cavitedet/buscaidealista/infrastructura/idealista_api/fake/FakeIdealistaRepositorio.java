package com.cavitedet.buscaidealista.infrastructura.idealista_api.fake;

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
    public List<Vivienda> getViviendas(double lat, double lon, double distanciaMetros, VentaAlquiler ventaAlquiler) throws IOException, LlamadaHttpException {

        File jsonFile = new File("../app/src/main/java/com/cavitedet/buscaidealista/infrastructura/idealista_api/fake/ejViviendas.json");
        BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
        String line;
        StringBuilder jsonBuilder = new StringBuilder();
        while((line = reader.readLine()) != null){
            jsonBuilder.append(line);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Vivienda.fromJsonList(jsonBuilder.toString());
    }






}
