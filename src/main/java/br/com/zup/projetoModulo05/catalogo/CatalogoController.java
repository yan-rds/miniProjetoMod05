package br.com.zup.projetoModulo05.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    CatalogoService service;

    @GetMapping("/{query}/{regiao}/{anoDeLancamento}")
    public Catalogo getFilmeEspecifico(@PathVariable String query,
                                       @PathVariable String regiao,
                                       @PathVariable String anoDeLancamento){
        return service.getFilmeEspecifico(query, regiao, anoDeLancamento);
    }


}
