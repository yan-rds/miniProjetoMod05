package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.dtos.CadastroSalaDTO;
import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @PostMapping
    public void cadastrarSala(Sala novaSala){
        reservaService.cadastrarAssento(novaSala);
    }

}
