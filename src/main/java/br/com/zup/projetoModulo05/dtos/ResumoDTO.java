package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.enums.Disponibilidade;

import javax.validation.constraints.NotNull;

public class ResumoDTO {

    @NotNull
    private int numero;
    @NotNull
    private Disponibilidade disponibilidade;

    public ResumoDTO() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
