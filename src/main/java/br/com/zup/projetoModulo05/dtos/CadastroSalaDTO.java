package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.reservaPoltrona.Reserva;

import java.util.List;

public class CadastroSalaDTO {
    private List<Reserva> assentos;

    public CadastroSalaDTO() {
    }

    public List<Reserva> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Reserva> assentos) {
        this.assentos = assentos;
    }
}
