package reqres.responseValidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class ResponseBodyValidation {
	@Test
	public void getAllUsers()
	{
		baseURI="https://reqres.in";
		Response rsp=when()
				.get("/api/unknown");
		rsp.then()
			.assertThat()
				.statusCode(200)
				.log().all();
		
		String actValue=rsp.jsonPath().get("data[3].name");
		Assert.assertEquals(actValue, "aqua sky");
	}
}