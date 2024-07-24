package Global_Logic.GSConsulting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NegativeScenario {
	
    public static void main(String[] args) {
        // Set the base URI
        RestAssured.baseURI = "https://httpbin.org";

        // Send a PUT request to the endpoint with an invalid JSON body and validate the response
        given().
            header("Content-Type", "application/json").
            body("{invalidJson}").  // Invalid JSON body
        when().
            put("/anything").  // Endpoint to test the PUT request
        then().
            assertThat().
            statusCode(400).  // Expecting a 400 Bad Request status code
            body("error", containsString("Invalid JSON")); // Adjust based on the actual error message returned by the API
    }
}