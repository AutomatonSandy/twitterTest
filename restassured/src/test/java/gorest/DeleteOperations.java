package gorest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import restmodels.UsersDelete;
import restmodels._Links;

public class DeleteOperations {
	RequestSpecification request = RestAssured.given();
	UsersDelete users = new UsersDelete();
	
	@Test
	public void deleteOperations(ITestContext context) {
		System.out.println("Starting Delete Operations");
		_Links links=(_Links) context.getAttribute("links");
		String url = links.getSelf().getHref();
		users= request.auth().preemptive().basic("KBjJ6_fgNmanrvNxHz4bb78VyH4scWQHxCDY", "pass")
				.delete(url).
				then().contentType(ContentType.JSON).extract().response().as(UsersDelete.class);
		System.out.println(users.getMeta().getMessage());
		System.out.println("============== Delete Operation Success ================");
		
	}

}
