package com.spring.crud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.domain.model.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
    
}
