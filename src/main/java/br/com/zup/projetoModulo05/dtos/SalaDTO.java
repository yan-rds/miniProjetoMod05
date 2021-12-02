package br.com.zup.projetoModulo05.dtos;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;
import br.com.zup.projetoModulo05.sala.Horario;

import java.util.List;

public class SalaDTO {

    private List<Assento> assentos;
    private String nomeFilme;
    private List <Horario> horarios;
    private int numeroAssentos;


    public SalaDTO() {
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

}
