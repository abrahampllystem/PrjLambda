package pe.com.demo.java.prjlambda.parseo.test.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class BibliotecaBean {

    private List<Autor> autor;
    private List<Obra> obra;
}
