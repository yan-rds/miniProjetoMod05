package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.enums.Disponibilidade;

import javax.validation.constraints.NotNull;

public class StatusAssentoDTO {

    @NotNull
    private Disponibilidade disponibilidade;

    public StatusAssentoDTO() {
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


}
