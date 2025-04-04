package pe.com.demo.java.prjlambda.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ObrasMapper {

    private  String nombre;
    private int cantidadPaginas;
    private double precio;
}
