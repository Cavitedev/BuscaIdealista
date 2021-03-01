package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import com.cavitedet.buscaidealista.infrastructura.idealista_api.http.LlamadorHttp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vivienda implements Parcelable {

    private String thumbnail;
    private String address;
    private double size;
    private double price;
    private double longitude, latitude;
    private String url;

    @JsonIgnore
    private Bitmap thumbnailBitmap;

    public Vivienda() {
    }

    public static Vivienda fromJson(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, Vivienda.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static List<Vivienda> fromJsonList(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, new TypeReference<List<Vivienda>>() {
            });


        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void cargarBitmapDesdeThumbail() {
        try {
            thumbnailBitmap = LlamadorHttp.getInstance().descargarImagen(thumbnail);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;

        new Thread() {
            @Override
            public void run() {
                cargarBitmapDesdeThumbail();
            }
        }.start();

    }






    protected Vivienda(Parcel in) {
        setThumbnail(in.readString());
        address = in.readString();
        url = in.readString();
        price = in.readDouble();
        size = in.readDouble();
        longitude = in.readDouble();
        latitude = in.readDouble();
    }

    public static final Creator<Vivienda> CREATOR = new Creator<Vivienda>() {
        @Override
        public Vivienda createFromParcel(Parcel in) {
            return new Vivienda(in);
        }

        @Override
        public Vivienda[] newArray(int size) {
            return new Vivienda[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(thumbnail);
        dest.writeString(address);
        dest.writeString(url);
        dest.writeDouble(price);
        dest.writeDouble(size);
        dest.writeDouble(longitude);
        dest.writeDouble(latitude);
//        thumbnailBitmap.writeToParcel(dest, flags);


    }

    public Bitmap getThumbnailBitmap() {
        return thumbnailBitmap;
    }

    public void setThumbnailBitmap(Bitmap thumbnailBitmap) {
        this.thumbnailBitmap = thumbnailBitmap;
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
