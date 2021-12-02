package br.com.zup.projetoModulo05.sala;

import javax.persistence.*;

@Entity
@Table(name = "Horarios")
public class Horario {

    @Id
    private String horarioDaSessao;

    public Horario() {
    }

    public String getHorarioDaSessao() {
        return horarioDaSessao;
    }

    public void setHorarioDaSessao(String horarioDaSessao) {
        this.horarioDaSessao = horarioDaSessao;
    }
}
