package Utilidades;

import Modelos.*;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {


    public UtilidadesEmpresa(){}

    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){
       /* List<Empleado> lista= new ArrayList<>();
        for (Empleado empleado:empresa.getEmpleados()){
            if(empleado.getContrato().getTipoContrato()== tipoContrato){
                lista.add(empleado);
            }
        }
        return lista;*/
        return empresa.getEmpleados().stream().filter(e-> e.getContrato().getTipoContrato().equals(tipoContrato)).collect(Collectors.toList());
    }

    public List<Empleado>getMileuristasOrdenadosPorSalario(Empresa empresa){

        Empleado aux;
        List<Empleado> lista = empresa.getEmpleados().stream().filter(e->e.getContrato().getSalarioBase()>=1000).collect(Collectors.toList());
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
            if (j.getEmpleados()==null){
                continue;
            }
            for (Empleado i:j.getEmpleados()){
                if(empleado.getContrato()==null){
                    empleado=i;
                }
                if(i.getContrato().getSalarioBase()>empleado.getContrato().getSalarioBase()){
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

    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas){
        //devuelve lista empleados pertenecientes a pymes con contrato practica
        List<Empleado> empleados = new ArrayList<>();
        for(Empresa empresa:empresas){
            for (Empleado empleado: empresa.getEmpleados()){
                if((empleado.getContrato().getTipoContrato()==TipoContrato.PRACTICAS)&&(empleado.getEmpresa().getTipoEmpresa()== TipoEmpresa.PYME))
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public Map<Empresa,Empleado> getLosMejorPagadosPorEmrpesa (List<Empresa> empresas){
        //mapa con el empleado que mas cobra


        Map<Empresa,Empleado> mapa = new HashMap<>();
        for (Empresa empresa:empresas){
            Empleado empleado = new Empleado();
            for (Empleado i:empresa.getEmpleados()){
                if(empleado.getContrato()==null){
                    empleado=i;
                }
                if(i.getContrato().getSalarioBase()>empleado.getContrato().getSalarioBase()){
                    empleado=i;
                }
            }
            mapa.put(empresa,empleado);
        }
        return mapa;
    }

}


