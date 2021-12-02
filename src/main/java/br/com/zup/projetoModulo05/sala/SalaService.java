package br.com.zup.projetoModulo05.sala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    SalaRepository salaRepository;

    public void cadastrarSala(Sala sala) {
        salaRepository.save(sala);

    }

    public List <Sala> exibirTodasAsSalas (String nomeFilme) {
        if (nomeFilme!=null) {
            return salaRepository.findAllByNomeFilme(nomeFilme);
        }
        List<Sala> salas = (List<Sala>) salaRepository.findAll();
        return salas;

    }

}
