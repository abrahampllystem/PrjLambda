package pe.com.demo.java.prjlambda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pe.com.demo.java.prjlambda.mapper.bean.AutorBean;
import pe.com.demo.java.prjlambda.mapper.bean.ObrasBean;

@Mapper
public interface ConversorMapper {


   @Mapping(target = "nombreMapper", source = "nombreBean")
   @Mapping(target = "montoMapper", source = "montoBean")
   @Mapping(target = "obrasMapper" , expression = "java(toObrasMapper(bean.getObrasBean()))")
    AutorMapper toAutorMapper(AutorBean bean);


//   @Mapping(target = "nombre", source = "nombre")
   @Mapping(target = "cantidadPaginas", source = "cantidadPaginas")
   @Mapping(target = "precio", source = "precio")
   @Mapping(target = "nombre", source = "precio")
   ObrasMapper toObrasMapper(ObrasBean bean);

}
