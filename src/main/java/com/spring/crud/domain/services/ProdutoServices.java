package com.spring.crud.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.api.assembler.ProdutoAssembler;
import com.spring.crud.api.exceptions.EntidadeNaoEncotrada;
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

        List<Produto> produtos = produtoRepositorio.findAllByAtivoTrue();

        return produtoAssembler.toCollectionModel(produtos);

    }

    @Transactional
    public ProdutoModel adicionar(ProdutoInput produtoInput) {

        Produto produto = produtoAssembler.toEntity(produtoInput);

        produto.setAtivo(true);

        produtoRepositorio.save(produto);

        return produtoAssembler.toModel(produto);

    }

    @Transactional
    public ProdutoModel atualizar(Long produtoId, ProdutoInput produtoInput) {

        if(!existeProduto(produtoId)){
            throw new EntidadeNaoEncotrada("Produto não encontrada");
        }
        Produto produto = produtoAssembler.toEntity(produtoInput);
        produto.setId(produtoId);
        produto.setAtivo(true);

        return produtoAssembler.toModel(produtoRepositorio.save(produto));
    }

    @Transactional
    public void deletar(Long produtoId) {

        Produto produto = pegaProduto(produtoId);

        produto.setAtivo(false);

        produtoRepositorio.save(produto);

    }

    @Transactional
    public ProdutoModel ativar(Long produtoId) {

        Produto produto = pegaProduto(produtoId);

        if(produto.isAtivo()){
            throw new EntidadeNaoEncotrada("O produto já está ativo");
        }
        produto.setAtivo(true);

        return produtoAssembler.toModel(produtoRepositorio.save(produto));

    }

    public Produto pegaProduto(Long produtoId){
        return produtoRepositorio.findById(produtoId).orElseThrow(() -> new EntidadeNaoEncotrada("Produto não existe"));
    }

    public boolean existeProduto(Long produtoId){
        return produtoRepositorio.findById(produtoId).isPresent();
    }
}
