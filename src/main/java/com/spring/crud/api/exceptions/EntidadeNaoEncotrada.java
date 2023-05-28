package com.spring.crud.api.exceptions;

public class EntidadeNaoEncotrada extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncotrada(String mensagem) {
        super(mensagem);
    }

}
