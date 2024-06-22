package com.diogo.microsservicos.produto.repository;

import com.diogo.microsservicos.produto.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
