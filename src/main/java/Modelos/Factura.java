package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Factura {
    private int identificador;
    private String codigoFactura;
    private double importeBase, descuento,iva,totalAPagar;
    private LocalDate fechaEmision,fechaVencimiento;
    private boolean pagada;
    private ArrayList<LineaFactura> lineaFacturas;
    private Cliente cliente;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public ArrayList<LineaFactura> getLineaFacturas() {
        return lineaFacturas;
    }

    public void setLineaFacturas(ArrayList<LineaFactura> lineaFacturas) {
        this.lineaFacturas = lineaFacturas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        String string ="";
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return identificador == factura.identificador && Double.compare(factura.importeBase, importeBase) == 0 && Double.compare(factura.descuento, descuento) == 0 && Double.compare(factura.iva, iva) == 0 && Double.compare(factura.totalAPagar, totalAPagar) == 0 && pagada == factura.pagada && Objects.equals(codigoFactura, factura.codigoFactura) && Objects.equals(fechaEmision, factura.fechaEmision) && Objects.equals(fechaVencimiento, factura.fechaVencimiento) && Objects.equals(lineaFacturas, factura.lineaFacturas) && Objects.equals(cliente, factura.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoFactura, importeBase, descuento, iva, totalAPagar, fechaEmision, fechaVencimiento, pagada, lineaFacturas, cliente);
    }
}
