package br.com.zup.projetoModulo05.dtos;

public class AssentoDTO {

    private int numero;
    private boolean assentoLivre;
    private boolean assentoPreferencial;

    public AssentoDTO() {
    }

    public boolean isAssentoPreferencial() {
        return assentoPreferencial;
    }

    public void setAssentoPreferencial(boolean assentoPreferencial) {
        this.assentoPreferencial = assentoPreferencial;
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
}
