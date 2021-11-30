package br.com.zup.projetoModulo05.dtos;

import javax.validation.constraints.NotNull;

public class ResumoDTO {

    @NotNull
    private int numero;
    @NotNull
    private boolean estaReservada;

    public ResumoDTO() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstaReservada() {
        return estaReservada;
    }

    public void setEstaReservada(boolean estaReservada) {
        this.estaReservada = estaReservada;
    }
}
