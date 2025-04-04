package pe.com.demo.java.prjlambda.condicionales;

import java.util.Objects;

public class ExampleCondition {

    public static void main(String[] args) {
        String estado = "a";
        String nombre = "daddy";
        String apellido = "barco";

//        if (Objects.nonNull(estado)){
//
//            System.out.println("estado es no nulo");
//        }
//
//        if (Objects.nonNull(nombre)){
//
//            System.out.println("nombre es no nulo");
//        }
//
//        if (Objects.nonNull(apellido)){
//
//            System.out.println("apellido es no nulo");
//        }


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta la iteración si i es par
            }
            System.out.println(i); // Solo imprime números impares
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                return; // Salta la iteración si i es par
            }
            System.out.println(i); // Solo imprime números impares
        }


    }

    public static int sumar(int a, int b) {
        if (a < 0 || b < 0) {
            return -1; // Retorna -1 si alguno de los números es negativo
        }
        return a + b; // Retorna la suma de a y b
    }
}
