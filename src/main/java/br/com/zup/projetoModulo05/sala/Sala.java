package br.com.zup.projetoModulo05.sala;

import br.com.zup.projetoModulo05.catalogo.Filme;
import br.com.zup.projetoModulo05.reservaPoltrona.Assento;

import javax.persistence.*;
import javax.validation.Valid;
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
}
