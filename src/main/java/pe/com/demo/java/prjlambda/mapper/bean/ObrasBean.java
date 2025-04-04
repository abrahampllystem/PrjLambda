package pe.com.demo.java.prjlambda.mapper.bean;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObrasBean
{
    private  String nombre;
    private int cantidadPaginas;
    private double precio;
}
