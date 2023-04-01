package reqres.CREDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteUserTest {
	@Test
	public void updateUserTest()
	{
		//Step 1: Create prerequisites -> body
			
		//Step 2: Send request
			
		Response response = RestAssured.delete("https://reqres.in/api/users/2");
			
		//Step 3: validate the response
			
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(204);
		val.log().all();
	}
}