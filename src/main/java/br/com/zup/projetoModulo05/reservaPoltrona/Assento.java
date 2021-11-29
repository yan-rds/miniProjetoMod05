package br.com.zup.projetoModulo05.reservaPoltrona;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "reserva")
public class Assento {
    @Id
    private int numero;
    private boolean estaReservada;
    private boolean assentoPreferencial;
    private double valor;

    public Assento() {
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
