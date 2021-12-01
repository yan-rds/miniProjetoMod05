package br.com.zup.projetoModulo05.config.exceptions;

public class AssentoJaReservado extends RuntimeException{

    public AssentoJaReservado(String message) {
        super(message);
    }
}
