package Utilidades;

import Modelos.Empleado;
import Modelos.Empresa;
import Modelos.TipoContrato;

import java.util.List;

public class UtilidadesEmpresa {
    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        return empresa.getEmpleados().stream().filter(e-> e.getContrato().getTipoContrato().equals(tipoContrato));
    }
}
