import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostRequestTests {
    private final static String BASE_URI = "https://postman-echo.com";
    private final String TEST_DATASTRING = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void init() {
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    @DisplayName("POST Raw Text")
    public void postRawText() {
        given()
                // .log().all()
                .body(TEST_DATASTRING)
                .when().post("/post")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("data", is(TEST_DATASTRING));
    }

    @Test
    @DisplayName("POST Form Data")
    public void postFormData() {
        given()
                // .log().all()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .when().post("/post")
                .then()
                // .log().all()
                .assertThat().statusCode(200)
                .and().body("form.foo1", is("bar1"))
                .and().body("form.foo2", is("bar2"));
    }
}
