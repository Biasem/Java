package Testter;

import Modelos.Cliente;
import Modelos.TipoCliente;
import Utilidades.UtilidadesCliente;
import org.junit.Test;

public class Tester {
    @Test
    public void dnitest(){
        Cliente cliente1 = new Cliente(1,"38746539a","pepe","kanijo","algunlao", TipoCliente.PARTICULAR);
        Boolean bool = UtilidadesCliente.esDniValido(cliente1);
    }
}
