package com.diogo.microsservicos.produto.dto;

import java.math.BigDecimal;

public record ProdutoResponse(String nome, String descricao, BigDecimal preco) {}
