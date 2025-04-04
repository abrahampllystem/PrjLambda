package pe.com.demo.java.prjlambda.optional;

import pe.com.demo.java.prjlambda.optional.interfaces.ComputadorRepositorio;
import pe.com.demo.java.prjlambda.optional.interfaces.Repository;
import pe.com.demo.java.prjlambda.optional.models.Computador;

import java.util.Optional;

public class EjemploRepositoryOrElse {

    public static void main(String[] args) {
        Repository<Computador> repository = new ComputadorRepositorio();

        Computador compu = repository.filtrar("asus");

        System.out.println("Computador: " + compu.getNombre());


        Optional<Computador> compu2 = repository.filter("samsung");
        compu2.ifPresentOrElse(s -> System.out.println(s.getNombre()),
                () -> System.out.println("No existe el computador"));


        Computador comp3 = repository.filter("nokia")
                .orElse(Computador.builder().nombre("HP OMEN").modelo("BAB01").build());

        System.out.println("Computador: " + comp3.getNombre());
    }
}
