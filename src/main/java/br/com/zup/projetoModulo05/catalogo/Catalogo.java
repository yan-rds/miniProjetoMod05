package br.com.zup.projetoModulo05.catalogo;
import java.util.List;

// Essa Model é o Catálogo exibido pro usuário, tudo que ela possui é uma lista de Title (filmes)
public class Catalogo {


    private List<Filme> results;


    public Catalogo() {
    }


    public List<Filme> getResults() {
        return results;
    }

    public void setResults(List<Filme> results) {
        this.results = results;
    }
}
