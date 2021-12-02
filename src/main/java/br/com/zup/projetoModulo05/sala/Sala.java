package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import javax.persistence.*;
import javax.validation.Valid;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    private List<Assento> assentos;
    private String nomeFilme;
    private Time primeiroHorario;
    private Time segundoHorario;
    private Time terceiroHorario;
    private Time quartoHorario;
    private Time quintoHorario;
    private Time sextoHorario;
    private Time setimoHorario;
    private Time oitavoHorario;
    private Time nonoHorario;
    private Time decimoHorario;

    private int numeroAssentos;


    public Sala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    public Time getPrimeiroHorario() {
        return primeiroHorario;
    }

    public void setPrimeiroHorario(Time primeiroHorario) {
        this.primeiroHorario = primeiroHorario;
    }

    public Time getSegundoHorario() {
        return segundoHorario;
    }

    public void setSegundoHorario(Time segundoHorario) {
        this.segundoHorario = segundoHorario;
    }

    public Time getTerceiroHorario() {
        return terceiroHorario;
    }

    public void setTerceiroHorario(Time terceiroHorario) {
        this.terceiroHorario = terceiroHorario;
    }

    public Time getQuartoHorario() {
        return quartoHorario;
    }

    public void setQuartoHorario(Time quartoHorario) {
        this.quartoHorario = quartoHorario;
    }

    public Time getQuintoHorario() {
        return quintoHorario;
    }

    public void setQuintoHorario(Time quintoHorario) {
        this.quintoHorario = quintoHorario;
    }

    public Time getSextoHorario() {
        return sextoHorario;
    }

    public void setSextoHorario(Time sextoHorario) {
        this.sextoHorario = sextoHorario;
    }

    public Time getSetimoHorario() {
        return setimoHorario;
    }

    public void setSetimoHorario(Time setimoHorario) {
        this.setimoHorario = setimoHorario;
    }

    public Time getOitavoHorario() {
        return oitavoHorario;
    }

    public void setOitavoHorario(Time oitavoHorario) {
        this.oitavoHorario = oitavoHorario;
    }

    public Time getNonoHorario() {
        return nonoHorario;
    }

    public void setNonoHorario(Time nonoHorario) {
        this.nonoHorario = nonoHorario;
    }

    public Time getDecimoHorario() {
        return decimoHorario;
    }

    public void setDecimoHorario(Time decimoHorario) {
        this.decimoHorario = decimoHorario;
    }
}
