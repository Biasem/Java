package Test;

import Modelos.Cliente;
import Modelos.TipoCliente;
import Utilidades.UtilidadesCliente;
import org.junit.Test;

public class Tester {

    @Test
    public void validardni(){
        UtilidadesCliente uc = new UtilidadesCliente();
        Cliente cliente1 = new Cliente(1,"23456789S","ppe","kañizare","algunlao", TipoCliente.PARTICULAR);
        Boolean bool =  uc.esDniValido(cliente1);
        a

    }

}
