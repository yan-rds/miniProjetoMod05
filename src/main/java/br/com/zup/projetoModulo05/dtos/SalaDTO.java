package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import java.util.List;

public class SalaDTO {

    private List<Assento> assentos;
    private String nomeFilme;

    public SalaDTO() {
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
}
