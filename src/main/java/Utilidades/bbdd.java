package Utilidades;

import Modelos.Almacen;
import Modelos.Cliente;
import Modelos.TipoCliente;

import java.util.ArrayList;
import java.util.List;

public class bbdd {
    bbdd(){}

    public static List<Almacen> bbddalmacenes(){
        List<Almacen> almacenes = new ArrayList<>();
        Almacen almacen1 = new Almacen(01,"Sevilla",200);
        Almacen almacen2 = new Almacen(02,"huelva",300);
        Almacen almacen3 = new Almacen(03,"Cadiz",400);
        almacenes.add(almacen1);
        almacenes.add(almacen2);
        almacenes.add(almacen3);
        return almacenes;
    }
    public static List<Cliente> bbddcliente(){
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente(01,"223311","juan","ramirez","c/sevilla", TipoCliente.PARTICULAR);
        clientes.add(cliente1);



        return clientes;
    }


}
