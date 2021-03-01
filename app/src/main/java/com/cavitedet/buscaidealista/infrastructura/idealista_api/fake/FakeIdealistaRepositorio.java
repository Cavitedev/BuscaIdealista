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
            "    \"propertyCode\": \"92118638\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/cb/4f/b6/848576647.jpg\",\n" +
            "    \"externalReference\": \"V-AB-1336\",\n" +
            "    \"numPhotos\": 21,\n" +
            "    \"floor\": \"5\",\n" +
            "    \"price\": 150000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 128.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Feria\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Feria\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.997196,\n" +
            "    \"longitude\": -1.8618265,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/92118638/\",\n" +
            "    \"distance\": \"598\",\n" +
            "    \"hasVideo\": true,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1172.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Feria, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88795818\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/81/56/a8/755586756.jpg\",\n" +
            "    \"externalReference\": \"67330\",\n" +
            "    \"numPhotos\": 26,\n" +
            "    \"floor\": \"3\",\n" +
            "    \"price\": 230000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 102.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Villacerrada - Centro\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9965,\n" +
            "    \"longitude\": -1.85246,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88795818/\",\n" +
            "    \"distance\": \"774\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 2255.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": true,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"91541445\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/90/id.pro.es.image.master/e0/75/c5/817019096.jpg\",\n" +
            "    \"externalReference\": \"2755\",\n" +
            "    \"numPhotos\": 17,\n" +
            "    \"floor\": \"4\",\n" +
            "    \"price\": 149000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 71.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 2,\n" +
            "    \"bathrooms\": 1,\n" +
            "    \"address\": \"Calle Blasco Ibáñez\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Fátima\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.994095,\n" +
            "    \"longitude\": -1.8637275,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/91541445/\",\n" +
            "    \"distance\": \"979\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": false,\n" +
            "      \"parkingSpacePrice\": 22000.0\n" +
            "    },\n" +
            "    \"priceByArea\": 2099.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Fátima, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Blasco Ibáñez\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": true,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"92001800\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/02/8c/8d/830620450.jpg\",\n" +
            "    \"externalReference\": \"A85209\",\n" +
            "    \"numPhotos\": 18,\n" +
            "    \"floor\": \"1\",\n" +
            "    \"price\": 100000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 100.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Fátima\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Fátima\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9959355,\n" +
            "    \"longitude\": -1.8634041,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/92001800/\",\n" +
            "    \"distance\": \"789\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": false,\n" +
            "    \"priceByArea\": 1000.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Fátima, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": true,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88484687\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/d2/99/03/812766761.jpg\",\n" +
            "    \"externalReference\": \"B060\",\n" +
            "    \"numPhotos\": 15,\n" +
            "    \"floor\": \"4\",\n" +
            "    \"price\": 160000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 110.0,\n" +
            "    \"exterior\": false,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Industria - Los Llanos del Águila\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Industria - Los Llanos del Águila\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0053268,\n" +
            "    \"longitude\": -1.8610379,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88484687/\",\n" +
            "    \"distance\": \"458\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1455.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Industria - Los Llanos del Águila, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": true,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88275795\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4a/0b/a7/743048272.jpg\",\n" +
            "    \"numPhotos\": 27,\n" +
            "    \"floor\": \"1\",\n" +
            "    \"price\": 215000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 200.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 5,\n" +
            "    \"bathrooms\": 3,\n" +
            "    \"address\": \"Calle Ricardo Castro\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9958004,\n" +
            "    \"longitude\": -1.8544542,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88275795/\",\n" +
            "    \"distance\": \"744\",\n" +
            "    \"hasVideo\": true,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1075.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Ricardo Castro\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"92569389\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/90/id.pro.es.image.master/3e/5e/66/842920057.jpg\",\n" +
            "    \"externalReference\": \"S076\",\n" +
            "    \"numPhotos\": 29,\n" +
            "    \"floor\": \"4\",\n" +
            "    \"price\": 160000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 116.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Villacerrada - Centro\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9961713,\n" +
            "    \"longitude\": -1.8556399,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/92569389/\",\n" +
            "    \"distance\": \"666\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1379.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88769539\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/3b/96/cf/754930594.jpg\",\n" +
            "    \"externalReference\": \"VCG1-2002\",\n" +
            "    \"numPhotos\": 34,\n" +
            "    \"floor\": \"3\",\n" +
            "    \"price\": 450000.0,\n" +
            "    \"propertyType\": \"duplex\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 306.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 5,\n" +
            "    \"bathrooms\": 4,\n" +
            "    \"address\": \"Gracia\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"El Pilar\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0009858,\n" +
            "    \"longitude\": -1.8626589,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88769539/\",\n" +
            "    \"distance\": \"390\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1471.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\",\n" +
            "      \"subTypology\": \"duplex\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"El Pilar, Albacete\",\n" +
            "      \"title\": \"Dúplex en Gracia\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"92510449\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/13/d3/37/841399408.jpg\",\n" +
            "    \"externalReference\": \"101\",\n" +
            "    \"numPhotos\": 29,\n" +
            "    \"floor\": \"2\",\n" +
            "    \"price\": 180000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 160.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 5,\n" +
            "    \"bathrooms\": 3,\n" +
            "    \"address\": \"Calle San Antonio\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9947826,\n" +
            "    \"longitude\": -1.8546973,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/92510449/\",\n" +
            "    \"distance\": \"839\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1125.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso en Calle San Antonio\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"91535469\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/a3/b8/cd/753357959.jpg\",\n" +
            "    \"externalReference\": \"Tipo A\",\n" +
            "    \"numPhotos\": 8,\n" +
            "    \"price\": 150000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 101.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Fernán Pérez de Oliva , 41\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Industria - Los Llanos del Águila\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0031655,\n" +
            "    \"longitude\": -1.8610319,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/obra-nueva/91535469/\",\n" +
            "    \"distance\": \"282\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"newdevelopment\",\n" +
            "    \"newDevelopment\": true,\n" +
            "    \"hasLift\": true,\n" +
            "    \"newDevelopmentFinished\": false,\n" +
            "    \"priceByArea\": 1485.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Industria - Los Llanos del Águila, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Fernán Pérez de Oliva , 41\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88105141\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/59/05/51/738736451.jpg\",\n" +
            "    \"externalReference\": \"Tipo E\",\n" +
            "    \"numPhotos\": 8,\n" +
            "    \"price\": 140000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 91.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Fernán Pérez de Oliva , 41\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Industria - Los Llanos del Águila\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0031655,\n" +
            "    \"longitude\": -1.8610319,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/obra-nueva/88105141/\",\n" +
            "    \"distance\": \"282\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"newdevelopment\",\n" +
            "    \"newDevelopment\": true,\n" +
            "    \"hasLift\": true,\n" +
            "    \"newDevelopmentFinished\": false,\n" +
            "    \"priceByArea\": 1538.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Industria - Los Llanos del Águila, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Fernán Pérez de Oliva , 41\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"92227243\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/13/b9/ac/834187690.jpg\",\n" +
            "    \"externalReference\": \"314061\",\n" +
            "    \"numPhotos\": 24,\n" +
            "    \"floor\": \"2\",\n" +
            "    \"price\": 132000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 131.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Blasco Ibáñez, 21\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Fátima\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9939539,\n" +
            "    \"longitude\": -1.8623019,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/92227243/\",\n" +
            "    \"distance\": \"940\",\n" +
            "    \"hasVideo\": true,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1008.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Fátima, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Blasco Ibáñez, 21\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88687163\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/12/46/0f/760513666.jpg\",\n" +
            "    \"externalReference\": \"a\",\n" +
            "    \"numPhotos\": 5,\n" +
            "    \"floor\": \"bj\",\n" +
            "    \"price\": 145000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 87.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 2,\n" +
            "    \"bathrooms\": 1,\n" +
            "    \"address\": \"Calle Murillo 24-, 26\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"El Pilar\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0002118,\n" +
            "    \"longitude\": -1.8657712,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/obra-nueva/88687163/\",\n" +
            "    \"distance\": \"672\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"newdevelopment\",\n" +
            "    \"newDevelopment\": true,\n" +
            "    \"hasLift\": true,\n" +
            "    \"newDevelopmentFinished\": false,\n" +
            "    \"priceByArea\": 1667.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"El Pilar, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Murillo 24-, 26\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88686772\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/c1/64/dc/760512598.jpg\",\n" +
            "    \"externalReference\": \"b\",\n" +
            "    \"numPhotos\": 7,\n" +
            "    \"floor\": \"3\",\n" +
            "    \"price\": 176000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 115.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Murillo 24-, 26\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"El Pilar\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0002118,\n" +
            "    \"longitude\": -1.8657712,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/obra-nueva/88686772/\",\n" +
            "    \"distance\": \"672\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"newdevelopment\",\n" +
            "    \"newDevelopment\": true,\n" +
            "    \"hasLift\": true,\n" +
            "    \"newDevelopmentFinished\": false,\n" +
            "    \"priceByArea\": 1530.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"El Pilar, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Murillo 24-, 26\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88992139\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/91/14/b3/760514513.jpg\",\n" +
            "    \"externalReference\": \"b\",\n" +
            "    \"numPhotos\": 7,\n" +
            "    \"floor\": \"1\",\n" +
            "    \"price\": 172000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 115.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Murillo 24-, 26\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"El Pilar\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 39.0002118,\n" +
            "    \"longitude\": -1.8657712,\n" +
            "    \"showAddress\": true,\n" +
            "    \"url\": \"https://www.idealista.com/obra-nueva/88992139/\",\n" +
            "    \"distance\": \"672\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"newdevelopment\",\n" +
            "    \"newDevelopment\": true,\n" +
            "    \"hasLift\": true,\n" +
            "    \"newDevelopmentFinished\": false,\n" +
            "    \"priceByArea\": 1496.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"El Pilar, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Murillo 24-, 26\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"87330782\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/fa/a5/02/840648651.jpg\",\n" +
            "    \"externalReference\": \"V-AB-1113\",\n" +
            "    \"numPhotos\": 26,\n" +
            "    \"floor\": \"6\",\n" +
            "    \"price\": 230000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 175.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"San Antonio Abad - Polígono San Antón\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"San Antonio Abad - Polígono San Antón\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9987699,\n" +
            "    \"longitude\": -1.8521189,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/87330782/\",\n" +
            "    \"distance\": \"629\",\n" +
            "    \"hasVideo\": true,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1314.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"San Antonio Abad - Polígono San Antón, Albacete\",\n" +
            "      \"title\": \"Piso\"\n" +
            "    },\n" +
            "    \"hasPlan\": true,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"91905169\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/d7/7a/36/826722094.jpg\",\n" +
            "    \"externalReference\": \"S071\",\n" +
            "    \"numPhotos\": 24,\n" +
            "    \"floor\": \"3\",\n" +
            "    \"price\": 130000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 131.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Ríos Rosas\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9950925,\n" +
            "    \"longitude\": -1.8583549,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/91905169/\",\n" +
            "    \"distance\": \"746\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 992.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Ríos Rosas\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"91622988\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/34/22/4f/819268637.jpg\",\n" +
            "    \"externalReference\": \"S072\",\n" +
            "    \"numPhotos\": 31,\n" +
            "    \"floor\": \"2\",\n" +
            "    \"price\": 250000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 190.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 5,\n" +
            "    \"bathrooms\": 3,\n" +
            "    \"address\": \"CARCELEN\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9955888,\n" +
            "    \"longitude\": -1.8555346,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/91622988/\",\n" +
            "    \"distance\": \"730\",\n" +
            "    \"hasVideo\": true,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"priceByArea\": 1316.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso en CARCELEN\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"88957860\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/7a/55/dd/788192720.jpg\",\n" +
            "    \"externalReference\": \"S060\",\n" +
            "    \"numPhotos\": 32,\n" +
            "    \"floor\": \"6\",\n" +
            "    \"price\": 165000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 170.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 4,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"Calle Pablo Medina\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"Villacerrada - Centro\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.99792,\n" +
            "    \"longitude\": -1.8568305,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/88957860/\",\n" +
            "    \"distance\": \"449\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"renew\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": false,\n" +
            "      \"parkingSpacePrice\": 22000.0\n" +
            "    },\n" +
            "    \"priceByArea\": 971.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"Villacerrada - Centro, Albacete\",\n" +
            "      \"title\": \"Piso en Calle Pablo Medina\"\n" +
            "    },\n" +
            "    \"hasPlan\": false,\n" +
            "    \"has3DTour\": false,\n" +
            "    \"has360\": false,\n" +
            "    \"hasStaging\": false,\n" +
            "    \"topNewDevelopment\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"propertyCode\": \"86371470\",\n" +
            "    \"thumbnail\": \"https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/d4/f9/80/691178487.jpg\",\n" +
            "    \"externalReference\": \"86044\",\n" +
            "    \"numPhotos\": 35,\n" +
            "    \"floor\": \"4\",\n" +
            "    \"price\": 185000.0,\n" +
            "    \"propertyType\": \"flat\",\n" +
            "    \"operation\": \"sale\",\n" +
            "    \"size\": 97.0,\n" +
            "    \"exterior\": true,\n" +
            "    \"rooms\": 3,\n" +
            "    \"bathrooms\": 2,\n" +
            "    \"address\": \"El Pilar\",\n" +
            "    \"province\": \"Albacete\",\n" +
            "    \"municipality\": \"Albacete\",\n" +
            "    \"district\": \"El Pilar\",\n" +
            "    \"country\": \"es\",\n" +
            "    \"latitude\": 38.9995469,\n" +
            "    \"longitude\": -1.860713,\n" +
            "    \"showAddress\": false,\n" +
            "    \"url\": \"https://www.idealista.com/inmueble/86371470/\",\n" +
            "    \"distance\": \"328\",\n" +
            "    \"hasVideo\": false,\n" +
            "    \"status\": \"good\",\n" +
            "    \"newDevelopment\": false,\n" +
            "    \"hasLift\": true,\n" +
            "    \"parkingSpace\": {\n" +
            "      \"hasParkingSpace\": true,\n" +
            "      \"isParkingSpaceIncludedInPrice\": true\n" +
            "    },\n" +
            "    \"priceByArea\": 1907.0,\n" +
            "    \"detailedType\": {\n" +
            "      \"typology\": \"flat\"\n" +
            "    },\n" +
            "    \"suggestedTexts\": {\n" +
            "      \"subtitle\": \"El Pilar, Albacete\",\n" +
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
