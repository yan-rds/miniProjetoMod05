package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.config.exceptions.AssentoNaoLocalizado;
import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssentoService {

    @Autowired
    AssentoRepository assentoRepository;


    public void cadastrarAssento(Assento assento) {
            assentoRepository.save(assento);
    }

    public List<Assento> exibirTodosOsAssentos() {
        List<Assento> assentos = (List<Assento>) assentoRepository.findAll();
        return assentos;
    }

    public Assento localizarAssento(int id) {
        for (Assento assentoReferencia : assentoRepository.findAll()) {
            if (assentoReferencia.getNumero() == id) {
                return assentoReferencia;
            }
        }
        throw new AssentoNaoLocalizado("O assento informado não foi localizado!");
    }

    public Assento atualizarStatusAssento(int id) {
        Assento assentoAtualizar = localizarAssento(id);
        assentoAtualizar.setDisponibilidade(Disponibilidade.RESERVADO);
        assentoRepository.save(assentoAtualizar);

        return assentoAtualizar;
    }

}

