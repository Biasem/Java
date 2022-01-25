package Utilidades;

import Modelos.Factura;
import Modelos.LineaFactura;

import java.time.LocalDate;
import java.util.ArrayList;

public class UtilidadesFactura {
    public static boolean esFacturaVencida(Factura factura) {
        if (factura.getFechaVencimiento().isAfter(LocalDate.now()) == true) {
            return true;
        } else {
            return false;
        }
    }
    public static double calcularBaseFactura(Factura factura){
    double base = 0;
    for (LineaFactura i:factura.getLineaFacturas()){
        double cantidad =i.getCantidad();
       base += cantidad*i.getProducto().getPrecio();
    }
        return base;
    }

    public static double calcularTotalAPagar(Factura factura){
        double total =0;
        total+= (calcularBaseFactura(factura)- factura.getDescuento())* factura.getIva();
        return total;
    }
}
