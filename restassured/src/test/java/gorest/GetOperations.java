package gorest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GetOperations {
	RequestSpecification requestSpec = RestAssured.given();
	Response response;

	
	@Test
	public void httpAuthBasic() {
		System.out.println("1");
		try {
		String url = "https://gorest.co.in/public-api/users";
		response = requestSpec
		.auth().preemptive().basic("KBjJ6_fgNmanrvNxHz4bb78VyH4scWQHxCDY", "pass")
		.when().get(url)
		.then().contentType(ContentType.JSON).extract().response();
		System.out.println(2);
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.jsonPath().getString("result[0]"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
