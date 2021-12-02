package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.dtos.SalaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class SalaController {

    @Autowired
    SalaService salaService;

    @Autowired
    ModelMapper conversor;

    @PostMapping("/sala")
    public void cadastrarSala(@Valid @RequestBody SalaDTO salaDTO){
        Sala sala = conversor.map(salaDTO, Sala.class);
        salaService.cadastrarSala(sala);
    }

   @GetMapping
    public List<SalaDTO> exibirTodasAsSalas (@RequestParam (required = false) String nomeFilme) {
        List <SalaDTO> salasDTO = new ArrayList<>();

        for (Sala referencia: salaService.exibirTodasAsSalas(nomeFilme)) {
            SalaDTO salaDTO = conversor.map(referencia, SalaDTO.class);
            salasDTO.add(salaDTO);
        }
        return salasDTO;
    }

}
