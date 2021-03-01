# Proyecto DAM BuscaIdealista

Proyecto para Programación Multimedia y Dispositivos Móviles 2020-2021 por Carlos Víllora Tercero.

## Motivación

Tenía que hacer una aplicación con mapas y ubicación. Para eso quería añadir a un mapa información adicional y pensé utilizar viviendas y contacte con idealista para que me diera una API para el desarrollo que solo permite 100 llamadas al mes **cuidado con eso.**

## Instalación

Clona el proyecto en android studio y copia o crea el fichero Secrets.properties en la raíz del proyecto. Este fichero no lo subiré a github porque contiene mi clave privada, esta clase tiene una variable llamada `auth` con la auth de idealista [API](https://developers.idealista.com/access-request) y los ficheros correspondientes a la API de mapas, se puede utilizar en fragmentMaps.java el repositorio falso para minimizar el uso de llamadas.

## Idioma

Todo en español a demanda del profesor, aunque quizás se me vaya la pinza y ponga algo en inglés, o usos especificos como en la clase Vivienda está en inglés para adaptar el json por ejemplo.

## Dependencias

La aplicación se ha hecho con un nivel mínimo de API 22 (Lollipop). Se utilizarán dependencias de okhttp para hacer llamadas http y jackson para convertir json a clases POJO , eso se puede ver en el [gradle](https://github.com/Cavitedev/BuscaIdealista/blob/master/build.gradle).

## Pantallas

### 1) Main Activity, El mapa

Consta de un mapa en el que pasado el suficiente tiempo se obtendrá la localización, iniciará un audio y mostrará en el mapa las viviendas que puedes comprar. Aquí hay un dialogo para elegir entre Venta y Compra en el menú superior derecho y otro botón del menú para ir al listado de viviendas obtenidas.

<img src="https://github.com/Cavitedev/BuscaIdealista/raw/master/resources/idealista-mapa.jpg" alt="idealista-mapa" style="zoom:50%;" />

### 2) Lista de viviendas

Se muestran las distintas vivienda obtenidas anteriormente y se pasarán a través de Intent dónde las imágenes se descargarán de nuevo.
<img src="https://github.com/Cavitedev/BuscaIdealista/raw/master/resources/idealista-viviendas.jpg" alt="Lista imagen" style="zoom:50%;" />

## Estructura

La aplicación se dividirá en 4 capas que serán las siguientes:

### 1) Dominio

Todos los datos e interfaces hacia la infrastrcutur.

### 2) Infraestructura

Clases para conectar con la api,

### 3) Aplicación

Todas las clases que gestionan la UI, activities, etc. desde Java.

### 4) Presentación

Los ficheros en res son la parte de la interfaz gráfica.

## Plantilla Requisitos

### 1) Tiene que constar de varias actívities, aunque también puede contener otros elementos

Eso está explicado en la parte de [pantallas](https://github.com/Cavitedev/BuscaIdealista#pantallas), los 2 primeros son los activities [mapa](https://github.com/Cavitedev/BuscaIdealistar#1-main-activity-el-mapa), [listado](https://github.com/Cavitedev/BuscaIdealista#2-lista-de-viviendas).

### 2) Debe haber al menos dos o más activities que se comuniquen información con intents

La actividad [mapa](https://github.com/Cavitedev/BuscaIdealistar#1-main-activity-el-mapa) pasá un Parcelable a la actividad [listado](https://github.com/Cavitedev/BuscaIdealista#2-lista-de-viviendas).

### 3) Debe contener algún elemento de reproducción multimedia.

La actividad [mapa](https://github.com/Cavitedev/BuscaIdealistar#1-main-activity-el-mapa) realiza un sonido mío hablando al actualizar las vivinedas.

### 4) Debe usar Localización y/o Mapas (preferiblemente ambos)

La actividad [mapa](https://github.com/Cavitedev/BuscaIdealistar#1-main-activity-el-mapa) utiliza tanto mapas como localización.

### 5) Debe usar memoria externa, bien mediante Preferences, archivos o BD. SQLite.

Guarda en preferencias el auth obtenido de la api que caduca a las 12 horas para poder reutilizarlo sin pedirlo cada vez que sea necesario, eso está en esta [clase](https://github.com/Cavitedev/BuscaIdealista/blob/master/app/src/main/java/com/cavitedet/buscaidealista/dominio/idealista_api/auth/Auth.java).

### 6) Debe contener Notificaciones, o Dialogos (barra estado, mensajes emergentes..etc)

Contiene un dialogo para elegir entre compra y ventas, también aparece un Toast si se intenta cargar las viviendas antes de que las cargue el mapa

### 7) Presentación gráfica y el uso de elementos no vistos en clase (menús, pestañas, controles personalizados, etc)

Nada en especial, un mapa y un RecyclerView muy sencillo, he preferido no dedicarle tiempo a eso

### 8) Se valora el uso de otros elementos vistos en clase…

La llamada a la api si cuentas el Backend, pero he intentado solo utilizar cosas vistas en clase

### 9) Otros comentarios o elementos incluidos.

#### API

He utilizado una [API](https://developers.idealista.com/access-request) de idealista porque creo que es la que mejor trabaja en Albacete.

#### Tests

También he añadido unos pocos[test unitarios](https://github.com/Cavitedev/BuscaIdealista/tree/master/app/src/test/java/com/cavitedet/buscaidealista) para ir desarrollando cosas específicas como la convierte el JSON a POJO. También tengo [tests instrumentados](https://github.com/Cavitedev/BuscaIdealista/tree/master/app/src/androidTest/java/com/cavitedet/buscaidealista) para comprobar el funcionamiento real de la  [API](https://developers.idealista.com/access-request) antes de hacer la interfaz gráfica.

#### Control de Versiones

He utilizado git con github para el control de versiones como de costumbre aunque cree de nuevo el proyecto cuando se me filtro la autenticación de idealista en el historial

## Fallos conocidos o cosas a mejorar

### 1) Orden en el código

Tenía prisas y poco tiempo y no quería alargar o mejorar este proyecto, así que la parte del fragmento y demás esta todo muy solapado

### 2) Control de excepciones

Aunque tenga algo montado para el control de excepciones nada llega a la ui, así que no me he molestado en implementarlo bien, si te da algún fallo avísame

### 3) Imágenes en el listado de viviendas

Al descargar de nuevo las imágenes estas no se actualizan hasta deslizar abajo y arriba en el RecyclerView

### 4) Presentación

No me he molestado en mejorar el texto ni nada

## Ejemplo respuesta json

Esta es la respuesta que me dio a 100 metros del instituto

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



