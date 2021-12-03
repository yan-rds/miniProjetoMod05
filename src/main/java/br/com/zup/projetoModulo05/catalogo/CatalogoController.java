package br.com.zup.projetoModulo05.catalogo;

import br.com.zup.projetoModulo05.catalogo.dtos.CatalogoCartazDTO;
import br.com.zup.projetoModulo05.catalogo.dtos.CatalogoEspelhoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    CatalogoService service;

    @Autowired
    ModelMapper conversor;

    @GetMapping("/{query}/{regiao}/{anoDeLancamento}")
    public CatalogoEspelhoDTO getFilmeEspecifico(@PathVariable String query,
                                       @PathVariable String regiao,
                                       @PathVariable String anoDeLancamento){
        Catalogo catalogo = service.getFilmeEspecifico(query, regiao, anoDeLancamento);
        CatalogoEspelhoDTO catalogoEspelhoDTO = conversor.map(catalogo, CatalogoEspelhoDTO.class);
        return catalogoEspelhoDTO;
    }

    @GetMapping()
    public CatalogoEspelhoDTO getDescobrirFilme(@RequestParam Optional<String> idioma,
                                      @RequestParam Optional<String> ordenar_por,
                                      @RequestParam Optional<String> incluir_adulto,
                                      @RequestParam Optional<String> ano_de_lancamento,
                                      @RequestParam Optional<String> genero){
        String filtroLingua;
        String filtroOrdenar;
        String filtroAdulto;
        String filtroAno;
        String filtroGenero;

        if (idioma.isEmpty()){
            filtroLingua = "pt-BR";
        }
        else {
            filtroLingua = idioma.get();
        }
       if (ordenar_por.isEmpty()){
            filtroOrdenar = "popularity.desc";
        }
       else {
           filtroOrdenar = ordenar_por.get();
       }
        if (incluir_adulto.isEmpty()){
            filtroAdulto = "false";
        }
        else {
            filtroAdulto = incluir_adulto.get();
        }
       if (ano_de_lancamento.isEmpty()){
            filtroAno = null;
        }else {
           filtroAno = ano_de_lancamento.get();
       }
       if (genero.isEmpty()){
            filtroGenero = null;
        }
       else {
           filtroGenero = genero.get();
       }
        Catalogo catalogo = service.descobrirFilme(filtroLingua,
                filtroOrdenar, filtroAdulto, filtroAno, filtroGenero);

        return conversor.map(catalogo, CatalogoEspelhoDTO.class);
    }

    @GetMapping("/cartaz")
    public CatalogoCartazDTO emCartaz(){
        Catalogo catalogo = service.emCartaz();
        return conversor.map(catalogo, CatalogoCartazDTO.class);
    }


}
