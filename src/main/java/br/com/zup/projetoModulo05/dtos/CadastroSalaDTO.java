package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import javax.validation.Valid;
import java.util.List;

public class CadastroSalaDTO {
    @Valid
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
