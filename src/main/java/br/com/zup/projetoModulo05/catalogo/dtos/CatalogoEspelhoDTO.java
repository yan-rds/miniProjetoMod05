package br.com.zup.projetoModulo05.catalogo.configs.dtos;

import br.com.zup.projetoModulo05.catalogo.Filme;

import java.util.List;

public class CatalogoEspelhoDTO {
    private List<FilmeEspelhoDTO> results;


    public CatalogoEspelhoDTO() {
    }

    public List<FilmeEspelhoDTO> getResults() {
        return results;
    }

    public void setResults(List<FilmeEspelhoDTO> results) {
        this.results = results;
    }
}
