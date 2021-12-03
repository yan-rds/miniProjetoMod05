package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.dtos.SalaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
@Api(value = "Controle de Salas")
@CrossOrigin(origins = "*")
public class SalaController {

    @Autowired
    SalaService salaService;

    @Autowired
    ModelMapper conversor;

    @PostMapping("/sala")
    @ApiOperation(value = "Cadastro de salas")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarSala(@Valid @RequestBody SalaDTO salaDTO){
        Sala sala = conversor.map(salaDTO, Sala.class);
        salaService.cadastrarSala(sala);
    }

   @GetMapping
   @ApiOperation(value = "Exibir todas as salas, com possibilidade de filtro por nome de filme")
    public List<SalaDTO> exibirTodasAsSalas (@RequestParam (required = false) String nomeFilme) {
        List <SalaDTO> salasDTO = new ArrayList<>();

        for (Sala referencia: salaService.exibirTodasAsSalas(nomeFilme)) {
            SalaDTO salaDTO = conversor.map(referencia, SalaDTO.class);
            salasDTO.add(salaDTO);
        }
        return salasDTO;
    }

}
