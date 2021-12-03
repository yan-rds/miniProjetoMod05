package br.com.zup.projetoModulo05.catalogo.dtos;

import java.util.List;

public class CatalogoCartazDTO {
    private List<FilmeCartazDTO> results;


    public CatalogoCartazDTO() {
    }

    public List<FilmeCartazDTO> getResults() {
        return results;
    }

    public void setResults(List<FilmeCartazDTO> results) {
        this.results = results;
    }
}
