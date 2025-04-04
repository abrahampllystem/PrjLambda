package pe.com.demo.java.prjlambda.optional;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;


public class EjemploOptionalTest {



    public static void main(String[] args) {
        String resultado  = String.valueOf(Texto1.getTexto1("RESULT").getDescripcion());
        String resultado2  =null;
        System.out.println("resultado is Blank`"+ StringUtils.isBlank(resultado2));

        System.out.println("resultado = " + resultado);


        Texto1 texto = Texto1.geText2("HOLA");
        System.out.println("Código: " + texto.getCodigo());

      //  String nombre = "Abraham";
//       String nombre = null;

//        String texto1 = "SBCAPMIN";
//        System.out.println(texto1.substring(texto1.length() - 3));


        /*String nombre = "hola1";
        String nombre2 = "hola2";
        Optional<String> nombreOptional = Optional.ofNullable(nombre);
        Optional<String> nombreOptional2 = Optional.ofNullable(nombre2);
        String hola = "";
        System.out.println("optional: " + nombreOptional);
        if (nombreOptional.isPresent()) {
            hola = hola + nombreOptional.get();
        }
        if (nombreOptional2.isPresent()) {
            hola =hola +  nombreOptional2.get();
        }
        System.out.println("resultado de hola : "+ hola);
        System.out.println("present: " + nombreOptional.isPresent());
        System.out.println("present: " + nombreOptional2.isPresent());
//        nombreOptional.ifPresent(s -> System.out.println("Hola " + s));
*/

        /*System.out.println("is Empty: " + nombreOptional.isEmpty());
        nombreOptional.ifPresentOrElse(s -> {String saldo=s.toUpperCase();
                    System.out.println("nuevo nombre: " + saldo);
            }
     ,() -> System.out.println("valor vacio"));*/

/*        nombreOptional.ifPresent(valor -> {
                    String upperCase = valor.toUpperCase();
                    System.out.println("resultado: " + upperCase);
        }
        );*/
    }
}
