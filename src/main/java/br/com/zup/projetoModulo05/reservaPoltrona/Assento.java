package br.com.zup.projetoModulo05.reservaPoltrona;

import br.com.zup.projetoModulo05.enums.Disponibilidade;
import br.com.zup.projetoModulo05.enums.TipoAssento;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "assentos")
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    @NotNull
    private Disponibilidade disponibilidade;
    @NotNull
    private TipoAssento tipoAssento;
    @NotNull
    private double valor;

    public Assento() {
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
}
