package br.com.zup.projetoModulo05.reservaPoltrona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

    @Autowired
    ReservaService reservaService;
}
