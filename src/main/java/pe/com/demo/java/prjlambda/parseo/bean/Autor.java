package pe.com.demo.java.prjlambda.parseo.bean;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    private String nombre;
    private String pais;
    private  int monto;
}
