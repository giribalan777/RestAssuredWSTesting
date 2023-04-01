package reqres.responseValidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class ResponseHeaderValidation {
	
	@Test
	public void headerValidation()
	{
		baseURI="http://reqres.in";
		when()
			.get("/api/users/2")
		.then()
			.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.header("X-Powered-By","Express")
				.header("CF-Cache-Status","HIT")
			.log().all();
	}
}