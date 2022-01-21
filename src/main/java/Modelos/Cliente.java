package Modelos;

import java.util.Objects;
import java.lang.String;


public class Cliente {
    private int identificador;
    private String dni, nombre, apellidos, direccion;
    private TipoCliente tipoCliente;

    public Cliente(){}
    public Cliente(int identificador,String dni,String nombre,
                   String apellidos,String direccion,TipoCliente tipoCliente){
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }
    public Cliente(Cliente c1){
        this.identificador = c1.getIdentificador();
        this.dni = c1.getDni();
        this.nombre = c1.getNombre();
        this.apellidos = c1.getApellidos();
        this.direccion = c1.getDireccion();
        this.tipoCliente = c1.getTipoCliente();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public String toString(){
        String string = "";
        string+= "Identificador: "+identificador+" DNI: "+dni;
        string+= " Nombre: "+nombre+" Apellidos"+apellidos;
        string+= " Direccion: "+direccion+"Tipo cliente"+tipoCliente;
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return identificador == cliente.identificador && Objects.equals(dni, cliente.dni) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(direccion, cliente.direccion) && tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, apellidos, direccion, tipoCliente);
    }
}
