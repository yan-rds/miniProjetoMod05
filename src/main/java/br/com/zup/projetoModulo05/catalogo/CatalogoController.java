package br.com.zup.projetoModulo05.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    CatalogoService service;

    @GetMapping("/{query}/{regiao}/{anoDeLancamento}")
    public Catalogo getCatalogo(@PathVariable String query,
                                @PathVariable String regiao,
                                @PathVariable String anoDeLancamento ){
        return service.getCatalogo(query, regiao, anoDeLancamento);
    }
}
