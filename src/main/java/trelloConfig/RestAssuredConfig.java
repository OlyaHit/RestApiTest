package trelloConfig;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredConfig {

	 public RequestSpecification getRequestSpecification() {
	        return RestAssured.given().contentType(ContentType.JSON);
	    }
	
}
