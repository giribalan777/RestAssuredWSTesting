package reqres.WaysToPostRequest;

import java.io.File;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateUserTestUsingJSONFile {
	@Test
	public void createUserTest()
	{
		File obj=new File("./src/test/resources/data.json");
		
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