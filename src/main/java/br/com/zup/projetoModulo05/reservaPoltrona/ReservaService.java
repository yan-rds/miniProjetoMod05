package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;

    /*Receber uma sala da controller, percorrer na lista de Sala todos os assentos e então cadastrar
    a sala recebida na repository */
    public void cadastrarAssento(Sala sala){
        for (Reserva reservaReferencia: sala.getAssentos()) {
           reservaRepository.save(reservaReferencia);
        }
    }

}
