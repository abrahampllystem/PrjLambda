package pe.com.demo.java.prjlambda;

import java.util.ArrayList;
import java.util.List;

public class ListaExample {

    public static void main(String[] args) {

//        List<Integer> numeros = List.of(10, 20, 30, 40);
        List<Integer> numeros =  new ArrayList<>();
        // Versión con manejo de lista vacía
        long numero = numeros.stream()
                .findFirst()
                .map(Integer::longValue)
                .orElseThrow(() -> new IllegalArgumentException("La lista está vacía"));

        System.out.println("Primer número: " + numero);
    }

}
