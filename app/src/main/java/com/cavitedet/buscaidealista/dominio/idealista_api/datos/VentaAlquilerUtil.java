package com.cavitedet.buscaidealista.dominio.idealista_api.datos;

public class VentaAlquilerUtil {

    public static String getNombreApiVentaAlquiler(VentaAlquiler ventaAlquiler){
        switch (ventaAlquiler){
            case VENTA:
                return "sale";
            case ALQUILER:
                return "rent";
        }
        return null;
    }

}
