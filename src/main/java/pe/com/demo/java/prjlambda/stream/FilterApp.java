package pe.com.demo.java.prjlambda.stream;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterApp {

    public static void main(String[] args) {

        List<String> listaOriginal = Arrays.asList("Hola", null, "", "Mundo", " ", "Java",  "Programación","Java2","paco");

        // Filtrado usando StringUtils para obtener solo los nulos o vacíos
        List<String> listaFiltrada = listaOriginal.stream()
                        .map(cadena -> cadena == null? "":cadena)
                                .collect(Collectors.toList());


        long cantidadNoNulos = listaOriginal.stream()
                .filter(cadena2  -> StringUtils.isNotBlank(cadena2) ) // Filtra nulos o vacíos
                .count();

        long cantidadNulos = listaOriginal.stream()
                        .filter(cadena -> StringUtils.isBlank(cadena))
                                .count();

        System.out.println("Cantidad de elementos no nulos " + cantidadNoNulos);
        System.out.println("Cantidad de elementos nulos : " + cantidadNulos);




//        System.out.println("Resultado (con StringUtils - nulos o vacíos): " + listaFiltrada.stream().count());
    }
}
