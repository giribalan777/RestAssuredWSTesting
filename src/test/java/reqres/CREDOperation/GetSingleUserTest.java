package reqres.CREDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleUserTest {
	@Test
	public void getAllUsersTest()
	{
		//Step 1: Create Prerequisites
		
		//Step 2: Send the request
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		//Step 3: validate the response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(200);
		val.log().all();
	}
}