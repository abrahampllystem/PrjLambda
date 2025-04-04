package pe.com.demo.java.prjlambda.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;

public class TestUtils {

    public static void main(String[] args) {

        String texto = null;
        String textoDato = "data";
        List<String> listaVacia = Collections.emptyList();
        System.out.println("cantidad de registos vacios "+ listaVacia.size());
        System.out.println("Lista vacía: " + listaVacia);

        if (StringUtils.isBlank(texto)){
            System.out.println(" es blanco");
        }else {
            System.out.println("no es blanco");
        }

        if (StringUtils.isBlank(textoDato)){
            System.out.println(" es blanco");
        }else {
            System.out.println("no es blanco");
        }

        if (StringUtils.isNotBlank(textoDato)){
            System.out.println("no esta vacio");
        } else {
            System.out.println(" si es vacio");
        }
    }
}
