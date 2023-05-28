package com.spring.crud.api.model.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProdutoInput {

    @NotBlank
    private String nome;

    @NotNull
    private int precoCentavos;

}
