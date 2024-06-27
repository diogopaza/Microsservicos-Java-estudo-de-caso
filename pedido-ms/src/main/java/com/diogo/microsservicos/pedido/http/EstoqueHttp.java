package com.diogo.microsservicos.pedido.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "estoque", url = "http://localhost:8082")
public interface EstoqueClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/estoque/exist")
    boolean isInEstoque(@RequestParam String nomeProduto, @RequestParam Integer quantidade);
}
