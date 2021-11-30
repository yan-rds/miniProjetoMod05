package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.enums.TipoAssento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssentoRepository extends CrudRepository<Assento, Integer> {

    List <Assento> findAllByDisponibilidade (Disponibilidade disponibilidade);
    List <Assento> findAllByTipoAssento (TipoAssento tipoAssento);

}
