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


        return Vivienda.fromJsonList(datos);
    }




    String datos = "[\n" +
            "  {\n" +
            "    \"propertyCode\": \"40013150\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg\",\n" +
            "    \"externalReference\": \"40243\",\n" +
            "    \"numPhotos\": 13,\n" +
            "    \"floor\": \"bj\",\n" +
            "    \"price\": 380000.0,\n" +
            "    \"propertyType\": \"chalet\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 257.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 3,\n" +
            "    \"address\": \"San Pablo - Santa Teresa\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9885703,\n" +
            "    \"longitude\": -1.8693012,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/40013150/\",\n" +
            "    \"distance\": \"34\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1479.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"chalet\",\n" +
            "      \"subTypology\": \"terracedHouse\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Chalet adosado\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"35756521\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/ba/8b/5e/668738871.jpg\",\n" +
            "    \"externalReference\": \"JV25\",\n" +
            "    \"numPhotos\": 37,\n" +
            "    \"floor\": \"bj\",\n" +
            "    \"price\": 380000.0,\n" +
            "    \"propertyType\": \"chalet\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 220.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 3,\n" +
            "    \"address\": \"San Pablo - Santa Teresa\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9880703,\n" +
            "    \"longitude\": -1.8695012,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/35756521/\",\n" +
            "    \"distance\": \"72\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1727.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"chalet\",\n" +
            "      \"subTypology\": \"terracedHouse\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Chalet adosado\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"86611855\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/17/65/23/698059991.jpg\",\n" +
            "    \"numPhotos\": 12,\n" +
            "    \"floor\": \"2\",\n" +
            "    \"price\": 62000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 125.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Donantes de Sangre\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9890615,\n" +
            "    \"longitude\": -1.8696366,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/86611855/\",\n" +
            "    \"distance\": \"39\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": false,\n" +
            "    \"priceByArea\": 496.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Donantes de Sangre\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88233836\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4c/8d/12/741984820.jpg\",\n" +
            "    \"externalReference\": \"ARK-318\",\n" +
            "    \"numPhotos\": 25,\n" +
            "    \"floor\": \"1\",\n" +
            "    \"price\": 68000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 70.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 1,\n" +
            "    \"address\": \"San Pablo - Santa Teresa\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9884611,\n" +
            "    \"longitude\": -1.8700591,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88233836/\",\n" +
            "    \"distance\": \"44\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": false,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 971.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"83250764\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/ce/df/7f/810402587.jpg\",\n" +
            "    \"externalReference\": \"NV0073\",\n" +
            "    \"numPhotos\": 13,\n" +
            "    \"floor\": \"3\",\n" +
            "    \"price\": 129000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 115.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Franciscanos\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Franciscanos\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.987953,\n" +
            "    \"longitude\": -1.8690335,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/83250764/\",\n" +
            "    \"distance\": \"99\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1122.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Franciscanos, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"81678146\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/3c/7b/ff/835433070.jpg\",\n" +
            "    \"externalReference\": \"VS-233\",\n" +
            "    \"numPhotos\": 4,\n" +
            "    \"floor\": \"bj\",\n" +
            "    \"price\": 60000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 85.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 1,\n" +
            "    \"address\": \"San Pablo - Santa Teresa\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9893094,\n" +
            "    \"longitude\": -1.8692513,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/81678146/\",\n" +
            "    \"distance\": \"75\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 706.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"90461030\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/4f/9f/790904939.jpg\",\n" +
            "    \"externalReference\": \"1203-1203\",\n" +
            "    \"numPhotos\": 14,\n" +
            "    \"floor\": \"2\",\n" +
            "    \"price\": 65000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 86.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 1,\n" +
            "    \"address\": \"San Pablo - Santa Teresa\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Pablo - Santa Teresa\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9888199,\n" +
            "    \"longitude\": -1.870092,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/90461030/\",\n" +
            "    \"distance\": \"39\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"priceByArea\": 756.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Pablo - Santa Teresa, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  }\n" +
            "]";


}
