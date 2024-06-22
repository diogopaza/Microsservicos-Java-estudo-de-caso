package com.diogo.microsservicos.produto.controller;

import com.diogo.microsservicos.produto.dto.ProdutoDto;
import com.diogo.microsservicos.produto.dto.ProdutoResponse;
import com.diogo.microsservicos.produto.model.Produto;
import com.diogo.microsservicos.produto.service.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse createProduto(@RequestBody ProdutoDto produtoDto){
        return produtoService.createProduto(produtoDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoResponse> getAllProdutos(){
        return produtoService.getAllProdutos();
    }

}
