package com.diogo.microsservicos.produto;

import org.springframework.boot.SpringApplication;

public class TestProdutoMsApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProdutoMsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
