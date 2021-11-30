package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Assento> exibirTodosOsAssentos(Boolean assentoLivre) {
        if (assentoLivre != null) {
            return assentoRepository.findAllByAssentoLivre(assentoLivre);
        }
        List<Assento> assentos = (List<Assento>) assentoRepository.findAll();

        return assentos;
    }



    public Assento localizarAssento(int id) {
        for (Assento assentoReferencia : assentoRepository.findAll()) {
            if (assentoReferencia.getNumero() == id) {
                return assentoReferencia;
            }
        }
        throw new RuntimeException("O assento informado não foi localizado!");
    }

    public Assento atualizarStatusAssento(int id) {
        Assento assentoAtualizar = localizarAssento(id);
        assentoAtualizar.setEstaReservada(true);
        assentoRepository.save(assentoAtualizar);

        return assentoAtualizar;
    }

}

