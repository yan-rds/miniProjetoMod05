package br.com.zup.projetoModulo05.dtos;

import javax.validation.constraints.NotNull;

public class StatusAssentoDTO {

    @NotNull
    private boolean estaReservada;

    public StatusAssentoDTO() {
    }

    public boolean isEstaReservada() {
        return estaReservada;
    }

    public void setEstaReservada(boolean estaReservada) {
        this.estaReservada = estaReservada;
    }

}
