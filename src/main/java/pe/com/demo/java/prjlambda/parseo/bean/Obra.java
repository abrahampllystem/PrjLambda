package pe.com.demo.java.prjlambda.parseo.bean;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Obra {

    private String titulo;
    private Integer paginas;
    private String genero;
    private Integer monto;
}
