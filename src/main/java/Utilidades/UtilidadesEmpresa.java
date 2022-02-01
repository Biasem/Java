package Utilidades;

import Modelos.Empleado;
import Modelos.Empresa;
import Modelos.TipoContrato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {
    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        return empresa.getEmpleados().stream().filter(e-> e.getContrato().getTipoContrato().equals(tipoContrato)).collect(Collectors.toList());
    }
//falta ordenarlos
    public static List<Empleado>getMileuristasOrdenadosPorSalario(Empresa empresa){

        return empresa.getEmpleados().stream().filter(e->e.getContrato().getSalarioBase()>1000).collect(Collectors.toList());
    }

    public static double fondoSalarialEmpresa(Empresa empresa){

        return empresa.getEmpleados().stream().mapToDouble(e->e.getContrato().getSalarioBase()).sum();
    }

    public Empleado getMejorPagado(List<Empresa> empresas){

        for (empresas:Empresa){

        }
    }

}
