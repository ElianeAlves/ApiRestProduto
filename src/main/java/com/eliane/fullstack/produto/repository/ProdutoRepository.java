package com.eliane.fullstack.produto.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import com.eliane.fullstack.produto.repository.entity.Produto;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<Produto> {
}
