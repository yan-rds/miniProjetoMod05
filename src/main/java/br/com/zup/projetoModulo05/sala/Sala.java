package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import java.util.List;

public class Sala {
    private List<Assento> assentos;

    public Sala() {
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
}
