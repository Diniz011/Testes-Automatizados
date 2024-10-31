import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CidadeApiTests {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080/api"; // Altere para o endpoint da sua API
    }

    // Teste para cadastro bem-sucedido de uma cidade
    @Test
    public void testCadastroCidadeComSucesso() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"nome\":\"Cidade Teste\", \"estado\":\"SP\"}")
                .when()
                .post("/cidades") // Endpoint da API
                .then()
                .statusCode(201) // Valida o status code 201
                .body("nome", equalTo("Cidade Teste")) // Valida o campo "nome" no JSON de resposta
                .body("estado", equalTo("SP")); // Valida o campo "estado" no JSON de resposta
    }

    // Teste para cadastro de cidade com dados inválidos
    @Test
    public void testCadastroCidadeDadosInvalidos() {
        given()
                .contentType(ContentType.JSON)
                .body("{\"estado\":\"SP\"}") // Campo "nome" está ausente
                .when()
                .post("/cidades")
                .then()
                .statusCode(400) // Valida o status code 400
                .body("mensagem", equalTo("Campo 'nome' é obrigatório")); // Valida a mensagem de erro
    }
}
