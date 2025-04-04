package pe.com.demo.java.prjlambda.optional;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
public enum  Texto1{
RESULT("HOLA","DEMO"),
RESULT2("HOLA2","DEMO2");

private String codigo;
private String descripcion;
Texto1(String codigo, String descripcion){
    this.codigo = codigo;
    this.descripcion = descripcion;
}

public static Texto1 getTexto1(String codigo2){
    return Arrays.stream(Texto1.values())
            .filter(code -> code.name().equals(codigo2))
            .findFirst().orElse(null);

}

    public static  Texto1 geText2(String code){
        return  Arrays.stream(Texto1.values())
                .filter(codigo1 -> codigo1.codigo.equals(code))
                .findFirst().orElse(null);
    }
    }


