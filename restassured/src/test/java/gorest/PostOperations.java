package gorest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import restmodels.Result;
import restmodels.Users;
import restmodels.UsersPost;
import restmodels._Links;

public class PostOperations {
	
	Result result = new Result();
	RequestSpecification request = RestAssured.given();
	UsersPost users= new UsersPost();
	
	public Result prepareData() {
		//List<Result> resultList= new ArrayList<Result>();
		Random rand= new Random();
		int random = rand.nextInt(100);
		result.setFirst_name("Sandipan");
		result.setLast_name("Sandy");
		result.setEmail("sandy_"+random+"@gmail.com");
		result.setGender("male");
		//resultList.add(result);
		return result;
	}
	
	@Test
	public void postResult() {
		String postUrl="https://gorest.co.in/public-api/users";
	    users = request.auth().preemptive().basic("KBjJ6_fgNmanrvNxHz4bb78VyH4scWQHxCDY", "pass").
	    		contentType(ContentType.JSON).
	    		body(prepareData()).
	    		post(postUrl).
	    		andReturn().as(UsersPost.class);
	    
	    System.out.println(users.getMeta().getMessage());
	    System.out.println(users.getResult().getFirst_name());
	    System.out.println(users.getResult().getPhone());
	    _Links links= new _Links();
	    links=users.getResult().get_links();
	    System.out.println(links.getSelf().getHref());
	}

}
