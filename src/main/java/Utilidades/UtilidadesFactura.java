package Utilidades;

import Modelos.Factura;

import java.time.LocalDate;

public class UtilidadesFactura {
    public static boolean esFacturaVencida(Factura factura) {
        if (factura.getFechaVencimiento().isAfter(LocalDate.now()) == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean calcularBaseFactura(Factura factura){

    }
}
