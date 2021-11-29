package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssentoService {

    @Autowired
    AssentoRepository assentoRepository;

    /*Receber uma sala da controller, percorrer na lista de Sala todos os assentos e então cadastrar
    a sala recebida na repository */
    public void cadastrarAssento(Sala sala) {
        for (Assento reservaReferencia : sala.getAssentos()) {
            assentoRepository.save(reservaReferencia);
        }
    }

    public List<Assento> exibirTodosOsAssentos() {

        List<Assento> assentos = (List<Assento>) assentoRepository.findAll();
        return assentos;
    }
}

