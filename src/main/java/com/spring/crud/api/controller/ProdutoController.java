package com.spring.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.api.model.ProdutoModel;
import com.spring.crud.api.model.input.ProdutoInput;
import com.spring.crud.domain.services.ProdutoServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoServices produtoServices;
    
    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listaProdutos() {
        
        return ResponseEntity.ok(produtoServices.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoModel adicionaProduto(@RequestBody @Valid ProdutoInput produtoInput) {
        
        return produtoServices.adicionar(produtoInput);

    }

    @PutMapping("/{produtoId}")
    public ResponseEntity<ProdutoModel> atualizaProduto(@PathVariable Long produtoId, @RequestBody ProdutoInput produtoInput) {
        
        return ResponseEntity.ok( produtoServices.atualizar(produtoId, produtoInput) );

    }

}
