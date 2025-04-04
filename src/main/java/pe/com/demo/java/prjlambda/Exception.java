package pe.com.demo.java.prjlambda;

public class Exception {

    public static void main(String[] args) {

        try {
            verificarNumero(-5); // Intentamos verificar un número negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }

    }


    public static void verificarNumero(int numero) {
        if (numero < 0) {
            // Lanzar una excepción si el número es negativo
            throw new IllegalArgumentException("El número debe ser positivo.");
        }
        System.out.println("El número es: " + numero);
    }
}
