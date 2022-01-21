package Modelos;

import java.time.LocalDate;
import java.util.Objects;
import java.lang.String;


public class Almacen {
   private int identificador;
   private String nombre;
   private int capacidad;

   public Almacen(){}
   public Almacen(int identificador,String nombre,int capacidad){
      this.identificador = identificador;
      this.nombre = nombre;
      this.capacidad=capacidad;
   }
   public Almacen(Almacen a1){
      this.identificador = a1.getIdentificador();
      this.nombre = a1.getNombre();
      this.capacidad = a1.getCapacidad();
   }

   public void setIdentificador(int identificador){
      this.identificador=identificador;
   }
   public int getIdentificador(){
      return identificador;
   }
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   public String getNombre(){
      return nombre;
   }
   public void setCapacidad(int capacidad){
      this.capacidad=capacidad;
   }
   public int getCapacidad(){
      return capacidad;
   }

   public String toString(){
      String string ="";
      string+= "Identificador: "+identificador+" Nombre: "+nombre+" Capacidad: "+capacidad;
      return string;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Almacen almacen = (Almacen) o;
      return identificador == almacen.identificador && capacidad == almacen.capacidad && Objects.equals(nombre, almacen.nombre);
   }

   @Override
   public int hashCode() {
      return Objects.hash(identificador, nombre, capacidad);
   }
}
