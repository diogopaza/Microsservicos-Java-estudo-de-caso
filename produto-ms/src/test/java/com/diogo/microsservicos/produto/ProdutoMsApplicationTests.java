package com.diogo.microsservicos.produto;


import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MongoDBContainer;


@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProdutoMsApplicationTests {

	@ServiceConnection
	static MongoDBContainer mongoDBContainer= new MongoDBContainer("mongo:7.0.5");

	@LocalServerPort
	private Integer serverPort;
	@BeforeEach
	void setup(){
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = serverPort;
	}

	static {
		mongoDBContainer.start();
	}
	@Test
	void shouldCreateProduto() {
		String requestBody = """
				{
				    "nome": "Pepsi",
				    "descricao": "Refrigerante lata 350ml",
				    "preco": 4
				}
				""";
		RestAssured.given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.post("/api/produto")
				.then()
				.statusCode(201)
				.body("nome", Matchers.equalTo("Pepsi"))
				.body("descricao", Matchers.notNullValue());
	}

}
