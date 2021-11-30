package br.com.zup.projetoModulo05.config;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public List<MensagemDeErro> manipularErrosDeValidacao(MethodArgumentNotValidException exception){
        List<MensagemDeErro> mensagensDeErro = new ArrayList<>();

        for (FieldError fieldError : exception.getFieldErrors()){
            MensagemDeErro mensagemDeErro = new MensagemDeErro(fieldError.getDefaultMessage());
            mensagensDeErro.add(mensagemDeErro);
        }

        return mensagensDeErro;
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErro naoLegivelException (){
        return new MensagemDeErro("Informação do JSON ilegível");
    }

}
