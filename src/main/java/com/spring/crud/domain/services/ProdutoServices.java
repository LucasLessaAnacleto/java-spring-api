package com.spring.crud.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.crud.api.model.ProdutoModel;
import com.spring.crud.api.model.input.ProdutoInput;
import com.spring.crud.domain.repository.ProdutoRepositorio;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProdutoServices {
    
    private ProdutoRepositorio produtoRepositorio;

    public List<ProdutoModel> listar(ProdutoInput produtoInput) {

        

        return produtoModel;
    }
}
