import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PatchRequestTests {
    private final static String BASE_URI = "https://postman-echo.com";
    private final String TEST_DATASTRING = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void init() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    @DisplayName("PATCH Request")
    public void patchRequest() {
        given()
                // .log().all()
                .body(TEST_DATASTRING)
                .when().patch("/patch")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }
}
