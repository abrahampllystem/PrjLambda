package pe.com.demo.java.prjlambda.parseo;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import pe.com.demo.java.prjlambda.parseo.bean.Autor;
import pe.com.demo.java.prjlambda.parseo.bean.BibliotecaJson;
import pe.com.demo.java.prjlambda.parseo.bean.JsonWrapper;
import pe.com.demo.java.prjlambda.parseo.bean.Obra;
import pe.com.demo.java.prjlambda.parseo.dto.AutorMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) throws IOException {

        var resultado = StringUtils.isNotBlank(null);
        System.out.println("resultado : "+ resultado);
        JsonWrapper obj = objBiblioteca();
        BibliotecaJson book = obj.getBibliotecaJson();

        List<Autor> autorList = new ArrayList<>(book.getAutor());
        List<Obra> obraList = new ArrayList<>(book.getObra());

            List<AutoRequest> autoRequest = AutorMapper.INSTANCE.toList(autorList);
            List<ObraRequest> obraRequests = AutorMapper.INSTANCE.toListObra(obraList);
//        autoRequest.forEach(objs -> System.out.println(objs.getPais()));
        obraRequests.forEach(listObra -> System.out.println(listObra.getGenero()));

//        System.out.println("cantidad de registros :"+ listaAuto.stream().count());

        List<Obra> filtroNulo = book.getObra().stream().filter(valor -> valor.getGenero() == null).toList();
//        filtroNulo.stream().forEach(obra -> System.out.println(obra.getTitulo()));
        List<Obra> filtroNoNulo = book.getObra().stream().filter(cadena -> StringUtils.isNotBlank(cadena.getGenero())).toList();


        int totalVentasNulos =  filtroNulo.parallelStream().mapToInt(Obra::getMonto).sum();
        int totalVentas = filtroNoNulo.parallelStream().mapToInt(Obra::getMonto).sum();
        int valorVentaMinimo = filtroNulo.stream().mapToInt(Obra::getMonto).min().getAsInt();
        System.out.println("ventas de nulos "+ totalVentasNulos);
        System.out.println("ventas  con datos "+ totalVentas);
        System.out.println("valor minimo  con nulo"+valorVentaMinimo);

        List<Autor> autor2= book.getAutor().stream()
                .map(autor ->
                Autor.builder().monto(autor.getMonto() - totalVentasNulos)
                 .nombre(autor.getNombre())
                 .pais(autor.getPais())
                 .build()

        ).toList();
//  List<Autor> autor2= book.getAutor().stream()
//                .peek(autor ->
//                Autor.builder().monto(autor.getMonto() - totalVentasNulos)
//                 .nombre(autor.getNombre())
//                 .pais(autor.getPais())
//                 .build()
//
//        ).toList();


        JsonWrapper wrapperConDeduccion = new JsonWrapper();
        book.setAutor(autor2);
        book.setObra(filtroNoNulo);
        wrapperConDeduccion.setBibliotecaJson(book);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/main/resources/ejemplo4.json"), wrapperConDeduccion);
        String jsonConDeduccion = mapper.writeValueAsString(wrapperConDeduccion);
        System.out.println("\nJSON with author deductions:");
        System.out.println(jsonConDeduccion);

    }



    public static JsonWrapper objBiblioteca (){
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonWrapper wrapper = mapper.readValue(new File("src/main/resources/ejemplo.json"), JsonWrapper.class);
            return  wrapper;
        } catch (StreamReadException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }
}
