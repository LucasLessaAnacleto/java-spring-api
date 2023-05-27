package com.spring.crud.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProdutoModel {

    private Long id;

    private String nome;

    private int precoCentavos;

}
