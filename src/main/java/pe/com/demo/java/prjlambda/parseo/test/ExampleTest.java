package pe.com.demo.java.prjlambda.parseo.test;

import org.apache.commons.lang3.StringUtils;
import pe.com.demo.java.prjlambda.parseo.bean.Autor;
import pe.com.demo.java.prjlambda.parseo.bean.BibliotecaJson;
import pe.com.demo.java.prjlambda.parseo.bean.Obra;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {

    public static void main(String[] args) {

        boolean estado = StringUtils.isNotBlank("vacio");
        System.out.println(" resultado del estado :" + estado);

        Autor objAutro = Autor.builder()
                .monto(20)
                .pais("peru")
                .nombre("cato")
                .build();

        Autor objAutro2 = Autor.builder()
                .monto(20)
                .pais("peru")
                .nombre("cato")
                .build();



        Obra objObra1 = Obra.builder()
                .monto(300)
                .genero("yago")
                .paginas(400)
                .titulo("maco2")
                .build();


        BibliotecaJson objBibliote = BibliotecaJson.builder()
                .autor(List.of(objAutro2, objAutro))
                .obra(List.of(objObra(), objObra()  ))
                .build();


        List<String> cadena = new ArrayList<>();
        cadena.add("abc");
        cadena.add("bcd");
        cadena.add("cde");


        List<String> cadena2 = new ArrayList<>();
        cadena.add("def");
        cadena.add("efg");
        cadena.add("fgh");


//        System.out.println("resultado del 1ero registro"+ cadena.get(0));

        List<String> listaDeListas = new ArrayList<>();
        listaDeListas.addAll(cadena2);
        listaDeListas.addAll(cadena);


        listaDeListas.stream()
                .forEach(x -> System.out.println(x));


    }

    public static  Obra objObra () {
        return Obra.builder()
                .monto(400)
                .genero("yago")
                .paginas(100)
                .titulo("maco")
                .build();
    }
}
