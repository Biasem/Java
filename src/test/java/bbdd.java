import Modelos.*;
import Utilidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class bbdd {

    public static void main(String[] args) {
        UtilidadesEmpresa  utilidadesEmpresa = new UtilidadesEmpresa();
        UtilidadesCliente utilidadesCliente = new UtilidadesCliente();
        UtilidadesFactura utilidadesFactura = new UtilidadesFactura();
        UtilidadesProducto utilidadesProducto = new UtilidadesProducto();

        List<Empleado> listaempleados = new ArrayList<>();
        List<Empleado> listaempleados2 = new ArrayList<>();
        List<Empleado> listaempleados3 = new ArrayList<>();
        List<Cliente> listaclientes = new ArrayList<>();
        List<Almacen> listaalmacenes = new ArrayList<>();
        List<Producto> listaproductos = new ArrayList<>();
        List<Empresa> listaempresas = new ArrayList<>();
        List<Factura> listafacturas = new ArrayList<>();
        ArrayList<LineaFactura> listalineafacturas = new ArrayList<>();

        Cliente cliente1 = new Cliente(1,"99988877A","juan","jjj","cualquier",TipoCliente.PARTICULAR);
        Cliente cliente2 = new Cliente(2,"99988","Pedrin","iiii","cualquier",TipoCliente.PARTICULAR);
        listaclientes.add(cliente1);
        listaclientes.add(cliente2);

        Almacen almacen1 = new Almacen(1,"Sevilla",500);
        Almacen almacen2 = new Almacen(2,"Cordoba",500);
        listaalmacenes.add(almacen1);

        Producto producto1 = new Producto(1,"P1","tomates", LocalDate.now(),TipoProducto.ALIMENTACION,almacen1,2.2);
        Producto producto2 = new Producto(2,"P2","peras", LocalDate.now(),TipoProducto.ALIMENTACION,almacen1,2.2);
        Producto producto3 = new Producto(3,"P3","zumo", LocalDate.now(),TipoProducto.BEBIDA,almacen1,2.2);
        listaproductos.add(producto1);
        listaproductos.add(producto2);
        listaproductos.add(producto3);

        Contrato contrato1 = new Contrato(1,1000,TipoContrato.INDEFINIDO);
        Contrato contrato2 = new Contrato(2,500,TipoContrato.PRACTICAS);
        Contrato contrato3 = new Contrato(3,600,TipoContrato.OBRAYSERVICIO);
        Contrato contrato4 = new Contrato(4,700,TipoContrato.TEMPORAL);
        Contrato contrato5 = new Contrato(4,1200,TipoContrato.INDEFINIDO);

        Empresa empresa1 = new Empresa(1,"e1",null,TipoEmpresa.NACIONAL);
        Empresa empresa2 = new Empresa(2,"e2",null,TipoEmpresa.PYME);
        Empresa empresa3 = new Empresa(3,"e3",null,TipoEmpresa.STARTUP);
        listaempresas.add(empresa1);
        listaempresas.add(empresa2);
        listaempresas.add(empresa3);

        Empleado empleado1 = new Empleado(1,"2342323H","pepe","jimenez","cantera 3","345334123",empresa1,contrato1);
        Empleado empleado2 = new Empleado(2,"2342323H","javi","jimenez","cantera 3","345334123",empresa1,contrato2);
        Empleado empleado3 = new Empleado(3,"2342323H","jose","jimenez","cantera 3","345334123",empresa1,contrato3);
        Empleado empleado4 = new Empleado(4,"2342323H","joselito","jimenez","cantera 3","345334123",empresa1,contrato4);
        Empleado empleado5 = new Empleado(5,"2342323H","pepe","jimenez","cantera 3","345334123",empresa1,contrato5);
        Empleado empleado6 = new Empleado(6,"2342323H","pepe","jimenez","cantera 3","345334123",empresa2,contrato1);
        Empleado empleado7 = new Empleado(7,"2342323H","pepe","jimenez","cantera 3","345334123",empresa3,contrato1);
        listaempleados.add(empleado1);
        listaempleados.add(empleado2);
        listaempleados.add(empleado3);
        listaempleados.add(empleado4);
        listaempleados.add(empleado5);
        listaempleados2.add(empleado6);
        listaempleados3.add(empleado7);

        empresa1.setEmpleados(listaempleados);
        empresa2.setEmpleados(listaempleados2);
        empresa3.setEmpleados(listaempleados3);

        Factura factura1 = new Factura(1,"f1",20,1.2,21.0,
                        30,LocalDate.now(),LocalDate.of(2023,12,01),true,listalineafacturas,cliente1);
        LineaFactura lineaFactura1 = new LineaFactura(1,3,factura1,producto1);
        LineaFactura lineaFactura2 = new LineaFactura(2,7,factura1,producto1);
        listalineafacturas.add(lineaFactura1);
        listalineafacturas.add(lineaFactura2);
        Factura factura2 = new Factura(2,"f2",20,1.2,21.0,
                30,LocalDate.now(),LocalDate.of(2023,12,01),true,listalineafacturas,cliente1);
        listafacturas.add(factura1);
        listafacturas.add(factura2);

        //Utilidades empresa
        //System.out.println(utilidadesEmpresa.getMileuristasOrdenadosPorSalario(empresa1));
        //System.out.println(utilidadesEmpresa.fondoSalarialEmpresa(empresa1));
        //System.out.println(utilidadesEmpresa.getMejorPagado(listaempresas));
        //System.out.println(utilidadesEmpresa.getEmpleadosPorContrato(empresa1,TipoContrato.INDEFINIDO));

        //System.out.println(utilidadesEmpresa.getEmpleadosPorTipoContrato(empresa1));
        //System.out.println(utilidadesEmpresa.getEmpleadosPorTipoContrato(listaempresas));

        //Utilidades Cliente
        //System.out.println(utilidadesCliente.esDniValido(cliente2));

        // Utilidades Factura
        //System.out.println(utilidadesFactura.esFacturaVencida(factura1));
        //System.out.println(utilidadesFactura.calcularBaseFactura(factura1));
        //System.out.println(utilidadesFactura.calcularTotalAPagar(factura1));
        //System.out.println(utilidadesFactura.gastoTotalCliente(listafacturas,cliente1));

        //utilidades producto
        //System.out.println(utilidadesProducto.getPorTipo(listaproductos,TipoProducto.ALIMENTACION));
        //System.out.println(utilidadesProducto.getPorAlmacen(listaproductos,almacen1));


    }
}


