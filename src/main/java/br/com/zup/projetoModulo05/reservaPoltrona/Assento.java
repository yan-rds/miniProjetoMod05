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
    private boolean assentoLivre;
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

    public boolean isAssentoLivre() {
        return assentoLivre;
    }

    public void setAssentoLivre(boolean assentoLivre) {
        this.assentoLivre = assentoLivre;
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
