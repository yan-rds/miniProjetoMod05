package br.com.zup.projetoModulo05.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    CatalogoService service;

    @GetMapping
    public Catalogo getCatalogo(){
        return service.getCatalogo();
    }
}
