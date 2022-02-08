package Utilidades;

import Modelos.Almacen;
import Modelos.Producto;
import Modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;


public class UtilidadesProducto {

   public UtilidadesProducto(){}

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){
        List<Producto> lista = new ArrayList<>();
        for (Producto i:productos){
            if(i.getTipoProducto().equals(tipo)){
                lista.add(i);
            }
        }
        return lista;
    }
    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){
        List<Producto> lista = new ArrayList<>();
        for (Producto i:productos){
            if(i.getAlmacen().equals(almacen)){
                lista.add(i);
            }
        }
        return lista;
    }

}
