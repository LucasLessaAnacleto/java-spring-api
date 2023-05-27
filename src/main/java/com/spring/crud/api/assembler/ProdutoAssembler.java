package com.spring.crud.api.assembler;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.spring.crud.api.model.ProdutoModel;
import com.spring.crud.api.model.input.ProdutoInput;
import com.spring.crud.domain.model.Produto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ProdutoAssembler {
    
    private ModelMapper modelMapper;

    public ProdutoModel toModel(Produto produto) {

        return modelMapper.map(produto, ProdutoModel.class);    

    }

    public List<ProdutoModel> toCollectionModel(List<Produto> produtos) {
       
        return produtos.stream().map(this::toModel).toList();

    }

    public Produto toEntity(ProdutoInput produtoInput) {

        return modelMapper.map(produtoInput, Produto.class);

    }

}
