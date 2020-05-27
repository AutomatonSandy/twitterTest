package gorest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restmodels.Users;

public class GetOperations {
	RequestSpecification requestSpec = RestAssured.given();
	Response response;

	
	@Test
	public void httpAuthBasic() {
		System.out.println("1");
		try {
		String url = "https://gorest.co.in/public-api/users";
		Users users = requestSpec
		.auth().preemptive().basic("KBjJ6_fgNmanrvNxHz4bb78VyH4scWQHxCDY", "pass")
		.when().get(url)
		.then().contentType(ContentType.JSON).extract().response().as(Users.class);
		System.out.println(users.getMeta().getMessage());
		System.out.println(users.getResult().get(0).getAddress());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
