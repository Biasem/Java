package Utilidades;

import Modelos.Cliente;
import Modelos.Factura;
import Modelos.LineaFactura;

import java.time.LocalDate;
import java.util.List;


public class UtilidadesFactura {

    public UtilidadesFactura(){}

    public boolean esFacturaVencida(Factura factura) {
        if (factura.getFechaVencimiento().isAfter(LocalDate.now()) == false) {
            return true;
        } else {
            return false;
        }
    }
    public double calcularBaseFactura(Factura factura){
    double base = 0;
    double iva = factura.getIva()/100+1;
    for (LineaFactura i:factura.getLineaFacturas()){
        double cantidad =i.getCantidad();
       base += cantidad*i.getProducto().getPrecio();
    }
    base = base/iva;
        return base;
    }

    public double calcularTotalAPagar(Factura factura){

        return (calcularBaseFactura(factura)*(factura.getIva()/100+1)*((100-factura.getDescuento())/100));
    }

    public double gastoTotalCliente(List<Factura> facturas, Cliente cliente){
        double importe = 0;
        for (Factura factura :facturas){
            if (factura.getCliente()==cliente){
                importe = importe+ calcularTotalAPagar(factura);
            }
        }
        return importe;
    }
}
