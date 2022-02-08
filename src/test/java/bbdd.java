import Modelos.*;
import Utilidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class bbdd {

    public static void main(String[] args) {
        UtilidadesEmpresa  ue = new UtilidadesEmpresa();


        Contrato c1 = new Contrato(1,1000,TipoContrato.INDEFINIDO);
        Contrato c2 = new Contrato(2,500,TipoContrato.PRACTICAS);
        Contrato c3 = new Contrato(3,600,TipoContrato.OBRAYSERVICIO);
        Contrato c4 = new Contrato(4,700,TipoContrato.TEMPORAL);
        Contrato c5 = new Contrato(4,1200,TipoContrato.INDEFINIDO);

        Empresa e1 = new Empresa(1,"e1",null,TipoEmpresa.NACIONAL);
        Empresa e2 = new Empresa(2,"e2",null,TipoEmpresa.PYME);
        Empresa e3 = new Empresa(3,"e3",null,TipoEmpresa.STARTUP);

        Empleado em1 = new Empleado(1,"2342323H","pepe","jimenez","cantera 3","345334123",e1,c1);
        Empleado em2 = new Empleado(2,"2342323H","pepe","jimenez","cantera 3","345334123",e1,c2);
        Empleado em3 = new Empleado(3,"2342323H","pepe","jimenez","cantera 3","345334123",e1,c3);
        Empleado em4 = new Empleado(4,"2342323H","pepe","jimenez","cantera 3","345334123",e1,c4);
        Empleado em5 = new Empleado(5,"2342323H","pepe","jimenez","cantera 3","345334123",e1,c5);

        List<Empleado> lem = new ArrayList<>();
        lem.add(em1);
        lem.add(em2);
        lem.add(em3);
        lem.add(em4);
        lem.add(em5);

        e1.setEmpleados(lem);

      //ue.getEmpleadosPorContrato(e1,TipoContrato.INDEFINIDO);
    e1.toString();


    }


}
