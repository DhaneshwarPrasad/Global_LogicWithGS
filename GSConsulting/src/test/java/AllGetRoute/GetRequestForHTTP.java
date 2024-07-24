package AllGetRoute;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.*;


import io.restassured.RestAssured;

public class GetRequestForHTTP {

	public static void main(String[] args) {
        // Set the base URI
        RestAssured.baseURI = "https://httpbin.org";
        
     // Authentication credentials
        String user1 = "user";
        String password = "passwd";

        // Send a GET request to the endpoint and validate the response code
        given().
        auth().preemptive().basic(user1, password).
        when().
            get("/basic-auth/{user}/{passwd}", user1, password).
        then().
            assertThat().
         statusCode(200).
        header("Content-Type", equalTo("application/json"));
        System.out.println(("Passed the status code"));
    }
}
