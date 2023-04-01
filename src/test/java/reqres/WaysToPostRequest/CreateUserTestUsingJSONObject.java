package reqres.WaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserTestUsingJSONObject {
	@Test
	public void createUserTest()
	{
		//Step 1: Create prerequisites
		
		baseURI="https://reqres.in";
		
		JSONObject obj=new JSONObject();
		obj.put("name", "JohnDurairaj");
		obj.put("job", "trainer");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201)
				.contentType(ContentType.JSON);
	}
}