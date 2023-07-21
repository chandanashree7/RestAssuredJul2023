package stepDefinitions;

import Using_Pojo.PostByUsingPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostApiTest {
	
	Response response;
	PostByUsingPojo post;
	
	
	@Given("user creates POST request for LMS API endpoint")
	public void user_creates_post_request_for_lms_api_endpoint() {
		RestAssured.baseURI = "https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms";
		RestAssured.basePath = "/saveprogram";
	}

	@When("user sends HTTPS	request and request body with mandatory ,additional fields.")
	public void user_sends_https_request_and_request_body_with_mandatory_additional_fields() {
		
		post=new PostByUsingPojo();
	}

	@Then("user receives {int} created status with response body")
	public void user_receives_created_status_with_response_body(Integer int1) {
		response=RestAssured.given()
				.log().all().contentType(ContentType.JSON).body(post.PostMethod())
				.when()
				.post()
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201)
				.extract().response();
	}

}
