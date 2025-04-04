package pe.com.demo.java.prjlambda.parseo.dto;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pe.com.demo.java.prjlambda.parseo.AutoRequest;
import pe.com.demo.java.prjlambda.parseo.ObraRequest;
import pe.com.demo.java.prjlambda.parseo.bean.Autor;
import pe.com.demo.java.prjlambda.parseo.bean.Obra;

import java.util.List;
@Mapper
public interface AutorMapper {

   AutorMapper INSTANCE = Mappers.getMapper(AutorMapper.class);


//    @MapMapping(target = "1", expressions = "1" )
//    Autor  toListAutor(BibliotecaBean obj);




   List<AutoRequest> toList(List<Autor> autor);

   @Mapping(target = "pais", source = "pais")
   @Mapping(target = "monto", source = "monto")
   AutoRequest toAutorRequest(Autor autor);



   List<ObraRequest> toListObra(List<Obra> obras);

   @Mapping(target = "monto", source = "monto")
   @Mapping(target = "genero", source = "paginas")
   @Mapping(target = "paginas", source = "paginas")
   ObraRequest toObraRequest(Obra autor);
}
