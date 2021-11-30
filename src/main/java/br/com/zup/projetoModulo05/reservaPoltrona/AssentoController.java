package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.dtos.AssentoDTO;
import br.com.zup.projetoModulo05.dtos.CadastroSalaDTO;
import br.com.zup.projetoModulo05.dtos.ResumoDTO;
import br.com.zup.projetoModulo05.dtos.StatusAssentoDTO;
import br.com.zup.projetoModulo05.sala.Sala;
import org.apache.tomcat.jni.Status;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public void cadastrarAssento(@Valid @RequestBody AssentoDTO assentoDTO){
        Assento assento = modelMapper.map(assentoDTO, Assento.class);
        assentoService.cadastrarAssento(assento);
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

    @PutMapping("/{id}")
    public ResumoDTO atualizarStatusAssento (@PathVariable int id, @Valid @RequestBody StatusAssentoDTO status) {
        ResumoDTO resumoDTO;
        if (status.isEstaReservada()) {
            resumoDTO = modelMapper.map(assentoService.atualizarStatusAssento(id), ResumoDTO.class);
            return resumoDTO;
        } else {
            return resumoDTO = modelMapper.map(assentoService.localizarAssento(id), ResumoDTO.class);
        }
    }

}
