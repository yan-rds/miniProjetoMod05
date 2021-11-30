package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.dtos.AssentoDTO;
import br.com.zup.projetoModulo05.sala.Sala;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class AssentoController {

    @Autowired
    AssentoService assentoService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/assentos")
    public void cadastrarSala(Sala novaSala){
        assentoService.cadastrarAssento(novaSala);
    }

    @GetMapping
    public List<AssentoDTO> exibirAssentos() {

        List <AssentoDTO> assentosDTOS = new ArrayList<>();

        for (Assento assento: assentoService.exibirTodosOsAssentos()) {

            AssentoDTO assentoDTO = modelMapper.map(assento, AssentoDTO.class);

            assentosDTOS.add(assentoDTO);
        }

        return assentosDTOS;
    }

}
