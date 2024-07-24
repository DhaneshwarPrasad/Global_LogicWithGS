package Global_Logic.GSConsulting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DelayedResponseTest {

    @Test
    public void testDelayedResponse() {
        int delayTime = 5; // delay time in seconds

        // Base URI for the REST API
        RestAssured.baseURI = "https://httpbin.org";

        // Send a request to the /delay/{delay_time} endpoint and validate the response
        Response response = given()
                                .pathParam("delay", delayTime)
                            .when()
                                .get("/delay/{delay}")
                            .then()
                                .statusCode(200) // Check that the response status code is 200 OK
                                .body("origin", equalTo("49.207.200.210")) // Validate the response body
                                .extract().response();

        // Additional validation can be added here
        System.out.println("Response Time: " + response.getTime() + " ms");
        
        // Assert that the response time is greater than or equal to the delay time
        assertThat(response.getTime(), greaterThanOrEqualTo((long) delayTime * 1000));
    }
}
