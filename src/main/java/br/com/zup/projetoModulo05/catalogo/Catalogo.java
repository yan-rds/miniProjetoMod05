package br.com.zup.projetoModulo05.catalogo;

import java.util.List;

public class Catalogo {
    private List<Filme> listaDeFilmes;

    public Catalogo() {
    }

    public List<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public void setListaDeFilmes(List<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }
}
