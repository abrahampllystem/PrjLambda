package pe.com.demo.java.prjlambda;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class ExamplePair {

    public static void main(String[] args) {

        Pair<String, String> pais = Pair.of("Ana","Peru");

        System.out.println(" valor de derecha : " + pais.getRight());
        System.out.println(" valor de izquierda  : " + pais.getLeft());
    }
}
