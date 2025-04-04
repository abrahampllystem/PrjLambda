package pe.com.demo.java.prjlambda.optional;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {
//        String nombre = "Abraham";
       String nombre = null;

//        String nombre = "";
        Optional<String> nombreOptional = Optional.ofNullable(nombre);
        System.out.println("optional: " + nombreOptional);
        System.out.println("es Empty: " + nombreOptional.isEmpty());
        System.out.println("present: " + nombreOptional.isPresent());
        nombreOptional.ifPresent(s -> System.out.println("Hola " + s));


        System.out.println("is Empty: " + nombreOptional.isEmpty());
        nombreOptional.ifPresentOrElse(s -> {String saldo=s.toUpperCase();
                    System.out.println("nuevo nombre: " + saldo);
            }
     ,() -> System.out.println("valor vacio"));

        String resultado = Optional.ofNullable(nombre).orElse("vacio");
        System.out.println("resultado del ofnullabe : "+  resultado);

/*        nombreOptional.ifPresent(valor -> {
                    String upperCase = valor.toUpperCase();
                    System.out.println("resultado: " + upperCase);
        }
        );*/
    }
}
