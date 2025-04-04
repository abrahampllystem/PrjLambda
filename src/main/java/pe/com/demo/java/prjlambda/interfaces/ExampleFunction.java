package pe.com.demo.java.prjlambda.interfaces;

import java.util.function.Function;

public class ExampleFunction {

    static Function<Integer, Integer> multiply = x -> x *10;
    static Function<Integer, Integer> sum = x -> x + 10;
    static Function<Integer, Integer> andThenMultiply = multiply.andThen(sum);

    public static void main(String[] args) {
        System.out.println(multiply.apply(5));
        System.out.println(sum.apply(5));

        System.out.println(sum.compose(multiply).apply(5));
        System.out.println(sum.andThen(multiply).apply(5));
        System.out.println(andThenMultiply.apply(5));
    }
}
