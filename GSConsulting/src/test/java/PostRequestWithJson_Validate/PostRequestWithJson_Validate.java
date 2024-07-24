package PostRequestWithJson_Validate;
import static io.restassured.RestAssured.*;
import org.json.JSONObject;
import io.restassured.RestAssured;

public class PostRequestWithJson_Validate {
	public static void main(String[] args) {
		// Set the base URI
        RestAssured.baseURI = "https://httpbin.org";

        // Create a JSON object to represent the request body
//        JSONObject requestParams = new JSONObject();
//        requestParams.put("Content-Length", "87");
//        requestParams.put("Content-Type", "application/json");
//        requestParams.put("freeform", "");

        String requestBody = "Content-Length";
        // Send a POST request to the endpoint with the JSON body and validate the response
        given().
            header("freeform", "").
            body(requestBody).
        when().
            post("/response-headers").
        then().
            assertThat().
            statusCode(200);  // Status code for resource creation
        System.out.println(("Passed the status code"));
	}

}
