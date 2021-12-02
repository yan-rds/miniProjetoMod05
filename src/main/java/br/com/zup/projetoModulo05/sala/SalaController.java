package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.dtos.SalaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cinema")
public class SalaController {

    @Autowired
    SalaService salaService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/salas")
    public void cadastrarSala(@Valid @RequestBody SalaDTO salaDTO){
        Sala sala = modelMapper.map(salaDTO, Sala.class);
        salaService.cadastrarSala(sala);
    }

}
