package Modelos;

import java.util.Objects;

public class Empleado extends Persona{
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(int identificador, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {
        super(identificador,dni,nombre,apellidos,direccion);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado(){}

    public Empleado(Empleado empleado){
        this.setIdentificador(empleado.getIdentificador());
        this.setDni(empleado.getDni());
        this.setNombre(empleado.getNombre());
        this.setApellidos(empleado.getApellidos());
        this.setDireccion(empleado.getDireccion());
        this.numTelefono= empleado.getNumTelefono();
        this.empresa=empleado.getEmpresa();
        this.contrato=empleado.getContrato();
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador=" + getIdentificador() +
                ", dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
               // ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numTelefono, contrato);
    }
}
