package Modelos;

import java.util.Objects;
import java.lang.String;


public class Cliente extends Persona{

    private TipoCliente tipoCliente;

    public Cliente(){}
    public Cliente(int identificador,String dni,String nombre,
                   String apellidos,String direccion,TipoCliente tipoCliente){
        super(identificador,dni,nombre,apellidos,direccion);
        this.tipoCliente = tipoCliente;
    }
    public Cliente(Cliente cliente){
        this.setIdentificador(cliente.getIdentificador());
        this.setDni(cliente.getDni());
        this.setNombre(cliente.getNombre());
        this.setApellidos(cliente.getApellidos());
        this.setDireccion(cliente.getDireccion());
        this.tipoCliente = cliente.getTipoCliente();
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public String toString(){
        String string = "";
        string+= "Identificador: "+getIdentificador()+" DNI: "+getDni();
        string+= " Nombre: "+getNombre()+" Apellidos"+getApellidos();
        string+= " Direccion: "+getDireccion()+" Tipo cliente"+tipoCliente;
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCliente);
    }
}
