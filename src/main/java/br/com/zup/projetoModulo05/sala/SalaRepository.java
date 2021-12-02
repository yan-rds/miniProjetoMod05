package br.com.zup.projetoModulo05.sala;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalaRepository extends CrudRepository <Sala, Integer>{

    List<Sala> findAllByNomeFilme (String nomeFilme); 
}
