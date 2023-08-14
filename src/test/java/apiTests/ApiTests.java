package apiTests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class ApiTests {
    private static final String endpoint = "https://jsonplaceholder.typicode.com/users";

    @Test
    public void testStatusCode() {
        given()
                .when()
                .get(endpoint)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void testResponseHeader() {
        given()
                .when()
                .get(endpoint)
                .then()
                .assertThat()
                .header("content-type", "application/json; charset=utf-8");
    }

    @Test
    public void testResponseBody() {
        given()
                .when()
                .get(endpoint)
                .then()
                .assertThat()
                .body("", hasSize(10));
    }
}
