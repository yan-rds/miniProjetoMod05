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
}
