package com.spring.crud.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.api.assembler.ProdutoAssembler;
import com.spring.crud.api.model.ProdutoModel;
import com.spring.crud.api.model.input.ProdutoInput;
import com.spring.crud.domain.model.Produto;
import com.spring.crud.domain.repository.ProdutoRepositorio;

import jakarta.transaction.Transactional;

@Service
public class ProdutoServices {
    
    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private ProdutoAssembler produtoAssembler;

    @Transactional
    public List<ProdutoModel> listar() {

        List<Produto> produtos = produtoRepositorio.findAll();

        return produtoAssembler.toCollectionModel(produtos);

    }

    @Transactional
    public ProdutoModel adicionar(ProdutoInput produtoInput) {

        Produto produto = produtoAssembler.toEntity(produtoInput);

        produtoRepositorio.save(produto);

        return produtoAssembler.toModel(produto);

    }

    @Transactional
    public ProdutoModel atualizar(Long produtoId, ProdutoInput produtoInput) {

        Produto produto = produtoAssembler.toEntity(produtoInput);

        if(produtoRepositorio.existsById(produtoId)){
            produto.setId(produtoId);
        }
        
          return produtoAssembler.toModel(produtoRepositorio.save(produto));

    }

    public Produto pegaProduto(Long produtoId){
        return produtoRepositorio.findById(produtoId).get();
    }
}
