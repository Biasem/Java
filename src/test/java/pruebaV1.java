import Modelos.*;

import java.time.LocalDate;

public class pruebaV1 {
    public static void main(String[] args) {
    Almacen a1 = new Almacen(1,"Pepe",30);
    Cliente c1 = new Cliente(1,"838412S","jaime","pere","C/sin numero", TipoCliente.PARTICULAR);
    Producto p1 = new Producto(1,"a2021", "caramelo", LocalDate.now(), TipoProducto.ALIMENTACION,a1,2.2);

        System.out.println(a1.toString());
        System.out.println(c1.toString());
        System.out.println(p1.toString());
    }
}
