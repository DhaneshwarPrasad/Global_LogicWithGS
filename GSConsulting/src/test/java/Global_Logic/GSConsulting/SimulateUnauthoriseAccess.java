package Global_Logic.GSConsulting;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SimulateUnauthoriseAccess {

	@Test
	public void testUnauthorizedAccess() {
		// Base URI for the REST API
		RestAssured.baseURI = "https://httpbin.org";

		// Send a request without authentication and validate the response
		given()
		.when()
		.get("/bearer")
		.then()
		.statusCode(401); // Expecting 401 Unauthorized status code
	}

	@Test
	public void testInvalidCredentials() {
		// Base URI for the REST API
		RestAssured.baseURI = "https://httpbin.org";

		// Send a request with invalid credentials and validate the response
		given()
		.auth()
		.preemptive()
		.basic("invalidUser", "invalidPassword") // Using invalid credentials
				.when().get("/bearer").then().statusCode(401); // Expecting 401 Unauthorized status code
	}
}
