package com.spring.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @GetMapping
    public String listaProdutos() {
        return "Lista de produtos";
    }

    @PostMapping
    public String adicionaProduto() {
        return "Adiciona produto";
    }

}
