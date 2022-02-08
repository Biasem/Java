package Utilidades;

import Modelos.Cliente;

public class UtilidadesCliente {
   public UtilidadesCliente(){}

    public boolean esDniValido(Cliente cliente){
        int validar;
        String dni = cliente.getDni();
        String dni1 = dni.substring(0,8);
        String dni2 = dni.substring(8);
        if (dni.length()!= 9){
            return false;
        }
        try{
            validar = Integer.parseInt(dni1);
        }catch (NumberFormatException e){
            validar =-1;
        }
        if(validar==-1){
            return false;
        }
        try{
            validar = Integer.parseInt(dni2);
        }catch (NumberFormatException e){
            validar =-1;
        }
        if(validar>=0){
            return true;
        }else{
            return false;
        }
    }
}
