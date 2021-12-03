package br.com.zup.projetoModulo05.catalogo.dtos;

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
