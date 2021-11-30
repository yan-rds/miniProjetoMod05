package br.com.zup.projetoModulo05.dtos;

import javax.validation.constraints.NotNull;

public class AssentoDTO {

    @NotNull
    private int numero;
    @NotNull
    private boolean estaReservada;
    @NotNull
    private boolean assentoPreferencial;
    @NotNull
    private double valor;

    public AssentoDTO() {
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

    public boolean isAssentoPreferencial() {
        return assentoPreferencial;
    }

    public void setAssentoPreferencial(boolean assentoPreferencial) {
        this.assentoPreferencial = assentoPreferencial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
