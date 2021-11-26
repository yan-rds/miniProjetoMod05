package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class AssentoController {

    @Autowired
    AssentoService assentoService;

    @PostMapping("/assentos")
    public void cadastrarSala(Sala novaSala){
        assentoService.cadastrarAssento(novaSala);
    }

}
