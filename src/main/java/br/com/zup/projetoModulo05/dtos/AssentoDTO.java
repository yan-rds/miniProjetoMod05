package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.enums.TipoAssento;

import javax.validation.constraints.NotNull;

public class AssentoDTO {

    @NotNull
    private Disponibilidade disponibilidade;
    @NotNull
    private TipoAssento tipoAssento;
    @NotNull
    private double valor;
    private int numero;


    public AssentoDTO() {
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public TipoAssento getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
