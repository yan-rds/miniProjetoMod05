package br.com.zup.projetoModulo05.dtos;

public class ResumoDTO {

    private int numero;
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
