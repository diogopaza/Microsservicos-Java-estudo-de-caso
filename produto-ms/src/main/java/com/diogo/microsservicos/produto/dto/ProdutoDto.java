package com.diogo.microsservicos.produto.dto;

import lombok.Data;

import java.math.BigDecimal;

public record ProdutoDto(String nome, String descricao, BigDecimal preco) {}
