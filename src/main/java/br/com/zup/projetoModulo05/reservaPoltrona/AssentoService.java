package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.config.exceptions.AssentoJaReservado;
import br.com.zup.projetoModulo05.config.exceptions.AssentoNaoLocalizado;
import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.enums.TipoAssento;
import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssentoService {

    @Autowired
    AssentoRepository assentoRepository;


    public void cadastrarAssento(Assento assento) {
        assentoRepository.save(assento);
    }

    public List<Assento> exibirTodosOsAssentos(Disponibilidade disponibilidade, TipoAssento tipoAssento) {

        if (disponibilidade != null) {
            return assentoRepository.findAllByDisponibilidade(disponibilidade);
        }
        if (tipoAssento!=null) {
            return assentoRepository.findAllByTipoAssento(tipoAssento);
        }

        List<Assento> assentos = (List<Assento>) assentoRepository.findAll();

        return assentos;
    }


    public Assento localizarAssento(int id) {
        Optional<Assento> assentolocalizado = assentoRepository.findById(id);
        if (assentolocalizado.isPresent()) {
            return assentolocalizado.get();
        } else {
            throw new AssentoNaoLocalizado("O assento informado não foi localizado!");
        }
    }

    public Assento atualizarStatusAssento(int id) {
        Assento assentoAtualizar = localizarAssento(id);
        if (assentoAtualizar.getDisponibilidade().equals(Disponibilidade.RESERVADO)) {
            throw new AssentoJaReservado("Este assento já está reservado");
        }
        assentoAtualizar.setDisponibilidade(Disponibilidade.RESERVADO);
        assentoRepository.save(assentoAtualizar);

        return assentoAtualizar;
    }

}

