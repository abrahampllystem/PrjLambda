package pe.com.demo.java.prjlambda.parseo.bean;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecaJson {

    private List<Autor> autor;
    private List<Obra> obra;
}
