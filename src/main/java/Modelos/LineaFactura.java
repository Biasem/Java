package Modelos;

import java.util.Objects;

public class LineaFactura {
    private int identificador,cantidad;
    private Factura factura;
    private Producto producto;

    public LineaFactura(int identificador, int cantidad, Factura factura, Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.factura = factura;
        this.producto = producto;
    }

    public LineaFactura(){}

    public LineaFactura(LineaFactura lineaFactura){
        this.identificador = lineaFactura.getIdentificador();
        this.cantidad = lineaFactura.getCantidad();
        this.factura = lineaFactura.getFactura();
        this.producto = lineaFactura.getProducto();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "LineaFactura{" +
                "identificador=" + identificador +
                ", cantidad=" + cantidad +
                //", factura=" + factura +
                //", producto=" + producto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaFactura that = (LineaFactura) o;
        return identificador == that.identificador && cantidad == that.cantidad && Objects.equals(factura, that.factura) && Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, cantidad, factura, producto);
    }
}
