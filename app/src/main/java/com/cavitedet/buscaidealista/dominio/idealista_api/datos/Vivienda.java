package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(value = {"propertyCode", "externalReference", "numPhotos", "floor", "propertyType", "operation", "size",
        "exterior", "rooms", "bathrooms", "province", "municipality", "district", "country", "showAddress",
        "distance", "hasVideo", "status", "newDevelopment", "parkingSpace", "priceByArea", "detailedType",
        "suggestedTexts", "hasPlan", "has3DTour", "has360", "hasStaging", "topNewDevelopment"})
public class Vivienda {

    private String thumbnail;
    private String address;
    private double size;
    private double price;
    private double longitude, latitude;
    private String url;


    public static Vivienda fromJson(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, Vivienda.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;

    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
