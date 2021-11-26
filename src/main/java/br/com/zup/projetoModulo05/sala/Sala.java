package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.reservaPoltrona.Reserva;

import java.util.List;

public class Sala {
    private List<Reserva> assentos;

    public Sala() {
    }

    public List<Reserva> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Reserva> assentos) {
        this.assentos = assentos;
    }
}
