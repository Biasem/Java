import Modelos.*;
import Utilidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class bbdd {

    public static void main(String[] args) {
        UtilidadesEmpresa  utilidadesEmpresae = new UtilidadesEmpresa();
        List<Empleado> listaempleados = new ArrayList<>();
        List<Cliente> listaclientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(1,"99988877A","juan","pito","cualquier",TipoCliente.PARTICULAR);

        Almacen almacen1 = new Almacen(1,"Sevilla",500);

        Producto producto1 = new Producto(1,"P1","tomates", LocalDate.now(),TipoProducto.ALIMENTACION,almacen1,2.2);

        Contrato contrato1 = new Contrato(1,1000,TipoContrato.INDEFINIDO);
        Contrato contrato2 = new Contrato(2,500,TipoContrato.PRACTICAS);
        Contrato contrato3 = new Contrato(3,600,TipoContrato.OBRAYSERVICIO);
        Contrato contrato4 = new Contrato(4,700,TipoContrato.TEMPORAL);
        Contrato contrato5 = new Contrato(4,1200,TipoContrato.INDEFINIDO);

        Empresa empresa1 = new Empresa(1,"e1",null,TipoEmpresa.NACIONAL);
        Empresa empresa2 = new Empresa(2,"e2",null,TipoEmpresa.PYME);
        Empresa empresa3 = new Empresa(3,"e3",null,TipoEmpresa.STARTUP);

        Empleado empleado1 = new Empleado(1,"2342323H","pepe","jimenez","cantera 3","345334123",empresa1,contrato1);
        Empleado empleado2 = new Empleado(2,"2342323H","javi","jimenez","cantera 3","345334123",empresa1,contrato2);
        Empleado empleado3 = new Empleado(3,"2342323H","jose","jimenez","cantera 3","345334123",empresa1,contrato3);
        Empleado empleado4 = new Empleado(4,"2342323H","joselito","jimenez","cantera 3","345334123",empresa1,contrato4);
        Empleado empleado5 = new Empleado(5,"2342323H","pepe","jimenez","cantera 3","345334123",empresa1,contrato5);


        listaempleados.add(empleado1);
        listaempleados.add(empleado2);
        listaempleados.add(empleado3);
        listaempleados.add(empleado4);
        listaempleados.add(empleado5);

        empresa1.setEmpleados(listaempleados);


        System.out.println(utilidadesEmpresae.getEmpleadosPorContrato(empresa1,TipoContrato.INDEFINIDO));




    }


}
