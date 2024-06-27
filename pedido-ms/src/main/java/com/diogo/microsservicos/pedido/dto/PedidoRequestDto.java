package com.diogo.microsservicos.pedido.PedidoRequest;

public record PedidoRequest(Long id, String numeroPedido, String codigo,
                            String preco, String quantidade) {}
