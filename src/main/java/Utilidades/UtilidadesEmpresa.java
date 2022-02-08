package Utilidades;

import Modelos.Contrato;
import Modelos.Empleado;
import Modelos.Empresa;
import Modelos.TipoContrato;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {


    UtilidadesEmpresa(){}

    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        return empresa.getEmpleados().stream().filter(e-> e.getContrato().getTipoContrato().equals(tipoContrato)).collect(Collectors.toList());
    }

    public List<Empleado>getMileuristasOrdenadosPorSalario(Empresa empresa){

        Empleado aux;
        List<Empleado> lista = empresa.getEmpleados().stream().filter(e->e.getContrato().getSalarioBase()>1000).collect(Collectors.toList());
        for (int i=0;i<lista.size()-1;i++){
            if(lista.get(i).getContrato().getSalarioBase()<lista.get(i+1).getContrato().getSalarioBase()){
                aux=lista.get(i+1);
                lista.remove(i+1);
                lista.add(i,aux);
                i=i-2;
                if(i<0){
                    i=0;
                }
            }
        }
        return lista;
    }

    public double fondoSalarialEmpresa(Empresa empresa){

        return empresa.getEmpleados().stream().mapToDouble(e->e.getContrato().getSalarioBase()).sum();
    }

    public Empleado getMejorPagado(List<Empresa> empresas){ //devuelve empleado que mas cobra
        Empleado empleado = new Empleado();

        for (Empresa j:empresas){
            for (Empleado i:j.getEmpleados()){
                if(i.getContrato().getSalarioBase()>empleado.getContrato().getSalarioBase()){
                    empleado=i;
                }
                if(empleado.getContrato()==null){
                    empleado=i;
                }
            }
        }
        return empleado;
    }

    public Map<TipoContrato,List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresa){ //mapa de los empleados por contrato

       return empresa.getEmpleados().stream().collect(Collectors.groupingBy(e -> e.getContrato().getTipoContrato()));

    }


    public Map<Empresa,Map<TipoContrato,List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){

        return getEmpleadosPorTipoContrato(empresas);

    }


}


