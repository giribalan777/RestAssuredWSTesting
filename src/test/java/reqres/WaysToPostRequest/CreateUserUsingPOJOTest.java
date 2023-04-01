package reqres.WaysToPostRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import pojoClasses.UserLibrary;

public class CreateUserUsingPOJOTest {
	@Test
	public void createUserTest()
	{
		UserLibrary obj=new UserLibrary("JohnDurairaj","Trainer");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.log().all()
			.assertThat()
				.statusCode(201);
	}
}