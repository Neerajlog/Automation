package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import CarryRestofInformation.Necessary_Information;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class getandpost extends Necessary_Information {

	@Test
	//get request
	public void testget() {
		
		baseURI=url;
	
		given().
		get(getapi).
		then().
		statusCode(200).
		body("data[1].id",equalTo(8)).
	    body("data[1].first_name",equalTo("Lindsay")).
		body("data.first_name",hasItems("Lindsay","Byron","Tobias"));
		
	}
	
	@Test
                    //put request	
	public void testpost() {
	//	HashMap<String,Object> map=new HashMap<String,Object>();
//		
//		map.put("name","Neeraj");
//		map.put("job","Teacher");
		
	
		JSONObject request=new JSONObject();
		request.put("name",Name_post);
		request.put("job", Job_post);
		
		baseURI=url;
		
		given().
		header("content-type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString()).
		when()
		.post(postapi)
		.then()
		.statusCode(201).log().all();
	}
}
