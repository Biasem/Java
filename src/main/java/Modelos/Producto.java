package Modelos;
import java.lang.String;
import java.util.Date;

public class Producto {
    private String codigoBarras;
    private String nombreProducto;
    private int cantidadBodegaProducto;
    private int cantidadMinimaProducto;
    private double precioCompraProducto;
    private double precioVentaProducto;
    private Date fechaVencimientoProducto;


    public Producto producto(Producto p1){
        return p1;
    }
    public void agregarProducto(){}
    public void eliminarProducto(){}
    public void modificarProducto(){}
    public Date obtenerFechaVencimiento(Date d1){
        return d1;
    }

}
