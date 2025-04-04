package pe.com.demo.java.prjlambda.optional.interfaces;

import pe.com.demo.java.prjlambda.optional.models.Computador;

import java.util.Optional;


public interface Repository<T> {
    Computador filtrar(String nombre);

    Optional<T> filter(String nombre);
}
