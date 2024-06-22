package com.diogo.microsservicos.produto.service;

import com.diogo.microsservicos.produto.dto.ProdutoDto;
import com.diogo.microsservicos.produto.dto.ProdutoResponse;
import com.diogo.microsservicos.produto.model.Produto;
import com.diogo.microsservicos.produto.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoResponse createProduto(ProdutoDto produtoDto){
        Produto produto = Produto.builder()
                .nome(produtoDto.nome())
                .descricao(produtoDto.descricao())
                .preco(produtoDto.preco())
                .build();
        produtoRepository.save(produto);
        log.info("Produto criado com sucesso");
        return new ProdutoResponse(produto.getNome(), produto.getDescricao(), produto.getPreco());
    }

    public List<ProdutoResponse> getAllProdutos(){
        return produtoRepository.findAll()
                .stream()
                .map(produto -> new ProdutoResponse(produto.getNome(), produto.getDescricao(),
                        produto.getPreco()))
                .toList();

    }

}
