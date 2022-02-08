package Utilidades;

import Modelos.Factura;
import Modelos.LineaFactura;

import java.time.LocalDate;


public class UtilidadesFactura {

    public UtilidadesFactura(){}

    public boolean esFacturaVencida(Factura factura) {
        if (factura.getFechaVencimiento().isAfter(LocalDate.now()) == true) {
            return true;
        } else {
            return false;
        }
    }
    public double calcularBaseFactura(Factura factura){
    double base = 0;
    for (LineaFactura i:factura.getLineaFacturas()){
        double cantidad =i.getCantidad();
       base += cantidad*i.getProducto().getPrecio();
    }
        return base;
    }

    public double calcularTotalAPagar(Factura factura){

        return (calcularBaseFactura(factura)- factura.getDescuento())* factura.getIva();
    }
}
