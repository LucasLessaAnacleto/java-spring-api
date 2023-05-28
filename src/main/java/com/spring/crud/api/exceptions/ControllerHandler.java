package com.spring.crud.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ControllerHandler {
    
    @ExceptionHandler(EntidadeNaoEncotrada.class)
    public ResponseEntity handlerEntidadeNaoEncontrada() {

        return new ResponseEntity<>("Produto não existe",HttpStatus.NOT_FOUND);

    }

}
