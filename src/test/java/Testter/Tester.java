package Testter;
import Modelos.Cliente;
import Modelos.TipoCliente;
import Utilidades.UtilidadesCliente;
import org.junit.Assert;

import org.junit.Test;

public class Tester {
    @Test
    public void dnitest(){
        Cliente cliente1 = new Cliente(1,"38746539a","pepe","kanijo","algunlao", TipoCliente.PARTICULAR);
        Cliente cliente2 = new Cliente(2,"3874639a","pepe","kanijo","algunlao", TipoCliente.PARTICULAR);
        Boolean bool = UtilidadesCliente.esDniValido(cliente1);


        Assert.assertTrue(UtilidadesCliente.esDniValido(cliente1));
        Assert.assertFalse(UtilidadesCliente.esDniValido(cliente2));
    }
}
