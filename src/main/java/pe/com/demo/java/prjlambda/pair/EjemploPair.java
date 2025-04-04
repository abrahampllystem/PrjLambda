package pe.com.demo.java.prjlambda.pair;


import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import pe.com.demo.java.prjlambda.pair.bean.AlumnoPair;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploPair {

    public static void main(String[] args) {

        List<AlumnoPair> cargaData = cargar();
        List<Pair<String, Integer>> alumnos20 = cargaData.stream()
                .filter(filter ->  filter.getEdad() == 20)
                .map(alumno -> Pair.of(alumno.getNombre(), alumno.getEdad()))
                .toList();

        Pair<String, Integer> alumnos19 = cargaData.stream()
                .filter(filter ->  filter.getEdad() == 19)
                .map(alumno -> Pair.of(alumno.getNombre(), alumno.getEdad()))
                .findFirst().orElseThrow();

        System.out.println("resultado de la izquierda "+alumnos19.getLeft());
        System.out.println("resultado de la derecha "+alumnos19.getRight());


    }


    public  static  List<AlumnoPair>     cargar(){

        return  List.of(
                new AlumnoPair("Juan", 20),
                new AlumnoPair("Ana", 19),
                new AlumnoPair("Luis", 20),
                new AlumnoPair("Marta", 22)
        );
    }
}
