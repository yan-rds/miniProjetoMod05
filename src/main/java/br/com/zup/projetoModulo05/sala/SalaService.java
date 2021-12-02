package br.com.zup.projetoModulo05.sala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    @Autowired
    SalaRepository salaRepository;

    public void cadastrarSala(Sala sala) {
        salaRepository.save(sala);

    }
}
