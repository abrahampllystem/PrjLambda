package pe.com.demo.java.prjlambda.mapper.bean;


import lombok.*;
import pe.com.demo.java.prjlambda.parseo.test.bean.BibliotecaBean;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AutorBean {

    private String nombreBean;
    private String paisBean;
    private  int montoBean;
    private  ObrasBean obrasBean;
}
