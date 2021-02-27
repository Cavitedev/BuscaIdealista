# BuscaIdealista, Anteproyecto Carlos Víllora Idealista

Será una aplicación que mostrará las viviendas a la venta alrededor tuyo:

## Contará con al menos esto

- Actividad con un mapa y los resultados
- Actividad para cambiar ajustes de búsqueda
- Se intentará utilizar contenido multimedia de idealista, si no añadiré un sonido al hacer la búsqueda por ejemplo
- Guardará la última búsqueda realizada
- Al seleccionar una vivienda se mostrará un dialogo con sus datos

## Posibles añadidos

- Notificar cuando el precio baje de cierto umbral y su correspondiente parte gráfica para configurarlo

## Ejemplo de datos que obtengo de la api a 100 metros del instituo

```json
{
  "elementList": [
    {
      "propertyCode": "40013150",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/cb/00/668266794.jpg",
      "externalReference": "40243",
      "numPhotos": 13,
      "floor": "bj",
      "price": 380000.0,
      "propertyType": "chalet",
      "operation": "sale",
      "size": 257.0,
      "exterior": false,
      "rooms": 3,
      "bathrooms": 3,
      "address": "San Pablo - Santa Teresa",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9885703,
      "longitude": -1.8693012,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/40013150/",
      "distance": "34",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "parkingSpace": {
        "hasParkingSpace": true,
        "isParkingSpaceIncludedInPrice": true
      },
      "priceByArea": 1479.0,
      "detailedType": {
        "typology": "chalet",
        "subTypology": "terracedHouse"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Chalet adosado"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "35756521",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/ba/8b/5e/668738871.jpg",
      "externalReference": "JV25",
      "numPhotos": 37,
      "floor": "bj",
      "price": 380000.0,
      "propertyType": "chalet",
      "operation": "sale",
      "size": 220.0,
      "exterior": false,
      "rooms": 3,
      "bathrooms": 3,
      "address": "San Pablo - Santa Teresa",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9880703,
      "longitude": -1.8695012,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/35756521/",
      "distance": "72",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "parkingSpace": {
        "hasParkingSpace": true,
        "isParkingSpaceIncludedInPrice": true
      },
      "priceByArea": 1727.0,
      "detailedType": {
        "typology": "chalet",
        "subTypology": "terracedHouse"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Chalet adosado"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "86611855",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/17/65/23/698059991.jpg",
      "numPhotos": 12,
      "floor": "2",
      "price": 62000.0,
      "propertyType": "flat",
      "operation": "sale",
      "size": 125.0,
      "exterior": true,
      "rooms": 4,
      "bathrooms": 2,
      "address": "Calle Donantes de Sangre",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9890615,
      "longitude": -1.8696366,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/86611855/",
      "distance": "39",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "hasLift": false,
      "priceByArea": 496.0,
      "detailedType": {
        "typology": "flat"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Piso en Calle Donantes de Sangre"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "88233836",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4c/8d/12/741984820.jpg",
      "externalReference": "ARK-318",
      "numPhotos": 25,
      "floor": "1",
      "price": 68000.0,
      "propertyType": "flat",
      "operation": "sale",
      "size": 70.0,
      "exterior": true,
      "rooms": 3,
      "bathrooms": 1,
      "address": "San Pablo - Santa Teresa",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9884611,
      "longitude": -1.8700591,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/88233836/",
      "distance": "44",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "hasLift": false,
      "parkingSpace": {
        "hasParkingSpace": true,
        "isParkingSpaceIncludedInPrice": true
      },
      "priceByArea": 971.0,
      "detailedType": {
        "typology": "flat"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Piso"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "83250764",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/ce/df/7f/810402587.jpg",
      "externalReference": "NV0073",
      "numPhotos": 13,
      "floor": "3",
      "price": 129000.0,
      "propertyType": "flat",
      "operation": "sale",
      "size": 115.0,
      "exterior": true,
      "rooms": 4,
      "bathrooms": 2,
      "address": "Franciscanos",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "Franciscanos",
      "country": "es",
      "latitude": 38.987953,
      "longitude": -1.8690335,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/83250764/",
      "distance": "99",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "hasLift": true,
      "priceByArea": 1122.0,
      "detailedType": {
        "typology": "flat"
      },
      "suggestedTexts": {
        "subtitle": "Franciscanos, Albacete",
        "title": "Piso"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "81678146",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/3c/7b/ff/835433070.jpg",
      "externalReference": "VS-233",
      "numPhotos": 4,
      "floor": "bj",
      "price": 60000.0,
      "propertyType": "flat",
      "operation": "sale",
      "size": 85.0,
      "exterior": false,
      "rooms": 3,
      "bathrooms": 1,
      "address": "San Pablo - Santa Teresa",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9893094,
      "longitude": -1.8692513,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/81678146/",
      "distance": "75",
      "hasVideo": false,
      "status": "renew",
      "newDevelopment": false,
      "hasLift": true,
      "priceByArea": 706.0,
      "detailedType": {
        "typology": "flat"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Piso"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    },
    {
      "propertyCode": "90461030",
      "thumbnail": "https://img3.idealista.com/blur/WEB_LISTING/0/id.pro.es.image.master/4e/4f/9f/790904939.jpg",
      "externalReference": "1203-1203",
      "numPhotos": 14,
      "floor": "2",
      "price": 65000.0,
      "propertyType": "flat",
      "operation": "sale",
      "size": 86.0,
      "exterior": false,
      "rooms": 4,
      "bathrooms": 1,
      "address": "San Pablo - Santa Teresa",
      "province": "Albacete",
      "municipality": "Albacete",
      "district": "San Pablo - Santa Teresa",
      "country": "es",
      "latitude": 38.9888199,
      "longitude": -1.870092,
      "showAddress": false,
      "url": "https://www.idealista.com/inmueble/90461030/",
      "distance": "39",
      "hasVideo": false,
      "status": "good",
      "newDevelopment": false,
      "priceByArea": 756.0,
      "detailedType": {
        "typology": "flat"
      },
      "suggestedTexts": {
        "subtitle": "San Pablo - Santa Teresa, Albacete",
        "title": "Piso"
      },
      "hasPlan": false,
      "has3DTour": false,
      "has360": false,
      "hasStaging": false,
      "topNewDevelopment": false
    }
  ],
  "total": 7,
  "totalPages": 1,
  "actualPage": 1,
  "itemsPerPage": 20,
  "numPaginations": 0,
  "hiddenResults": false,
  "summary": [
    "Comprar",
    "Viviendas",
    "distrito San Pablo - Santa Teresa, Albacete",
    "Todos los precios",
    "Todos los tamaños"
  ],
  "lowerRangePosition": 0,
  "upperRangePosition": 7,
  "paginable": false
}
```

