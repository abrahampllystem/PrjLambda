package pe.com.demo.java.prjlambda.mapper;

import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import pe.com.demo.java.prjlambda.mapper.bean.AutorBean;
import pe.com.demo.java.prjlambda.mapper.bean.ObrasBean;

@AllArgsConstructor
public class TestMapper {

    private static final ConversorMapper mapper = Mappers.getMapper(ConversorMapper.class);

    public static void main(String[] args) {

        ObrasBean objObrasBean = new ObrasBean();
        objObrasBean.setNombre("paco yunque");
        objObrasBean.setPrecio(22.20);
        objObrasBean.setCantidadPaginas(40);

        AutorBean objAutorBean = new AutorBean();
        objAutorBean.setMontoBean(20);
        objAutorBean.setPaisBean("Peru");
        objAutorBean.setNombreBean("cesar vallejo");
        objAutorBean.setObrasBean(objObrasBean);

        AutorMapper autorMapper = new AutorMapper();
        autorMapper= mapper.toAutorMapper(objAutorBean);


        System.out.println("catnidad de paginas de la obra " +autorMapper.getObrasMapper().getCantidadPaginas());




    }
}
