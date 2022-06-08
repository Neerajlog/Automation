package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import CarryRestofInformation.Necessary_Information;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class putanddelete extends Necessary_Information {
 
	@Test
                      	//put request
	public void testput(){
		JSONObject request=new JSONObject();
		request.put("name",Name_put );
		request.put("job",Job_put);
		
		baseURI=url;
		
		given().
		header("content-type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put(putapi)
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	                // delete request
	public void deletetest() {
		
		baseURI=url;

		given()
		.delete(deleteapi)
		.then()
		.statusCode(204)
		.log().all();
	}
}
