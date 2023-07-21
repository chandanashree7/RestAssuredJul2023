package Using_Pojo;

import POJOClass.CreateUserPOJO;

public class PostByUsingPojo {

	public CreateUserPOJO PostMethod() {

		CreateUserPOJO post = new CreateUserPOJO();

		post.setProgramDescription("RestAssuredHackathon");
		post.setProgramName("POSTrequest");
		post.setProgramStatus("active");

		return post;
	}
}
