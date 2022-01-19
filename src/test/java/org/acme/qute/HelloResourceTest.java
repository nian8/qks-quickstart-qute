package org.acme.qute;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testEndpoint() {
        given()
                .when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(containsString("<p>Hello world!</p>"));

        given()
                .when()
                .get("/hello?name=Lucie")
                .then()
                .statusCode(200)
                .body(containsString("<p>Hello Lucie!</p>"));

        given()
                .when()
                .header("Accept-Language", "de")
                .get("/hello")
                .then()
                .statusCode(200)
                .body(containsString("<p>Hallo world!</p>"));
    }

}
