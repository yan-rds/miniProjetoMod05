package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import java.util.List;

public class CadastroSalaDTO {
    private List<Assento> assentos;

    public CadastroSalaDTO() {
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
}
