package pe.com.demo.java.prjlambda.optional;

import pe.com.demo.java.prjlambda.optional.interfaces.ComputadorRepositorio;
import pe.com.demo.java.prjlambda.optional.interfaces.Repository;
import pe.com.demo.java.prjlambda.optional.models.Computador;

import java.util.Optional;

public class EjemploRepository {

    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepositorio();

        Computador compu = repository.filtrar("asus");

        System.out.println("Computador: " + compu.getNombre());


        Optional<Computador> compu2 = repository.filter("samsung");
        compu2.ifPresentOrElse(s -> System.out.println(s.getNombre()),
                () -> System.out.println("No existe el computador"));


    }
}
