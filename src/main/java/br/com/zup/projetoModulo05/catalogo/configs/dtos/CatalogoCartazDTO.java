package br.com.zup.projetoModulo05.catalogo.configs.dtos;

import br.com.zup.projetoModulo05.catalogo.Filme;

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
