package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.config.exceptions.AlteracaoDisponibilidadeInvalida;
import br.com.zup.projetoModulo05.dtos.AssentoDTO;
import br.com.zup.projetoModulo05.dtos.ResumoDTO;
import br.com.zup.projetoModulo05.dtos.StatusAssentoDTO;
import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.enums.TipoAssento;
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
@RequestMapping("/assentos")
@Api(value = "Controle de assentos individualmente")
@CrossOrigin(origins = "*")
public class AssentoController {

    @Autowired
    AssentoService assentoService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    @ApiOperation(value = "Cadastrar um assento")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarAssento(@Valid @RequestBody AssentoDTO assentoDTO){
        Assento assento = modelMapper.map(assentoDTO, Assento.class);
        assentoService.cadastrarAssento(assento);
    }

    @GetMapping
    @ApiOperation(value = "ExibirAssentos com possibilidade de filtro de Disponibilidade e tipoAssento")
    public List<AssentoDTO> exibirAssentos(@RequestParam(required = false) Disponibilidade disponibilidade, @RequestParam (required = false) TipoAssento tipoAssento) {

        List <AssentoDTO> assentosDTOS = new ArrayList<>();
        for (Assento assento: assentoService.exibirTodosOsAssentos(disponibilidade,tipoAssento)) {
            AssentoDTO assentoDTO = modelMapper.map(assento, AssentoDTO.class);
            assentosDTOS.add(assentoDTO);
        }
        return assentosDTOS;
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Realizar a reserva de um assento")
    public ResumoDTO atualizarStatusAssento (@PathVariable int id, @Valid @RequestBody StatusAssentoDTO status) {
        ResumoDTO resumoDTO;
        if (status.getDisponibilidade().equals(Disponibilidade.RESERVADO)) {
            resumoDTO = modelMapper.map(assentoService.atualizarStatusAssento(id), ResumoDTO.class);
            return resumoDTO;
        } else {
            throw new AlteracaoDisponibilidadeInvalida("Não é possível alterar um assento para VAZIO");
        }
    }

}
