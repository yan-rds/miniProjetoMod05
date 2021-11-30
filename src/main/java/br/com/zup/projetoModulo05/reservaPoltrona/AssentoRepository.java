package br.com.zup.projetoModulo05.reservaPoltrona;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssentoRepository extends CrudRepository<Assento, Integer> {

    List <Assento> findAllByAssentoLivre (Boolean assentoLivre);

}
