import java.util.*;
import java.util.stream.Collectors;

public class prueba {

    public static void main(String[] args) {

        List<Numeros> lista = new ArrayList<>();
        for(int i =99; i>=0;i--){
            Random r1 = new Random();

            Numeros n1 = new Numeros();
            int num = r1.nextInt(100);
            n1.setNumero(num);
            lista.add(n1);

        }

        List<Numeros> lista2= lista.stream().filter(n->n.getNumero()>50).collect(Collectors.toList());
        Collections.sort(lista2);

        for(int i=0; i<lista2.size();i++){

            lista2.get(i).getNumero();
        }

        System.out.println("////////////////////////////////////");
        for (Numeros num:lista){
            System.out.println(num.getNumero());
        }
    }
    static class Numeros{

        public Numeros(){}
        private int numero;

        public int getNumero(){
            return this.numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Numeros{" +
                    "numero=" + numero +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Numeros numeros = (Numeros) o;
            return numero == numeros.numero;
        }

        @Override
        public int hashCode() {
            return Objects.hash(numero);
        }
    }
}

