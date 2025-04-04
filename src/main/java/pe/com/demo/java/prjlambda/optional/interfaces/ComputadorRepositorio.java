package pe.com.demo.java.prjlambda.optional.interfaces;

import ch.qos.logback.core.util.StringUtil;
import org.springframework.util.StringUtils;
import pe.com.demo.java.prjlambda.optional.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio  implements Repository<Computador> {

    private List<Computador> datasoure;

    public ComputadorRepositorio() {
        datasoure = new ArrayList<>();
        datasoure.add(Computador.builder().nombre("MacBookPro").modelo("m3").build());
        datasoure.add(Computador.builder().nombre("MacBookPro Mini").modelo("m4").build());

    }

    /**
     * @param nombre
     * @return
     */
    @Override
    public Computador filtrar(String nombre) {
        return
                datasoure.stream().filter(comp -> comp.getNombre().equals(nombre))
                .findFirst().orElse(Computador.builder().nombre("NO SE ENCONTRO REGISTRO").build());

    }

    /**
     * @param nombre
     * @return
     */
    @Override
    public Optional<Computador> filter(String nombre) {
        return datasoure.stream().filter(comp -> comp.getNombre().equals(nombre))
                .findFirst();
    }
}
