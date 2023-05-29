package com.spring.crud.api.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoModel {

    private Long id;

    private String nome;

    private int precoCentavos;

}
