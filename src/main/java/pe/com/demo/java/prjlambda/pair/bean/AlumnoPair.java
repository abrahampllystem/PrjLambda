package pe.com.demo.java.prjlambda.pair.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class AlumnoPair {

    private String nombre;
    private Integer edad;
}
