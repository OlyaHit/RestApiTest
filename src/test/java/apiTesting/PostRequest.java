package apiTesting;
import static org.junit.Assert.*;
import org.junit.*;

import TwitterApi.RestApi.Address;
import TwitterApi.RestApi.Person;
import TwitterApi.RestApi.Posts;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {
	public String url ="http://localhost:3000/posts";

	@Ignore
	@Test
	public void postNewGuyPost(){
		
		Posts newPost = new Posts("3","Olga's post1","Olga");
		Response response=
		given().
		when().
		contentType(ContentType.JSON).
		body(newPost)
		.post(url);
		
		
		System.out.println(response.asString());
		
	}
	@Ignore
	@Test
	public void putUpdatePost(){
		
		Posts newPost = new Posts("3","Olga's update","Olga");
		Response response=
		given().
		when().
		contentType(ContentType.JSON).
		body(newPost).
		put("http://localhost:3000/posts/3");
		
		System.out.println(response.asString());
		
	}
	@Ignore
	@Test
	public void getRequestExtractResult(){
		Response response=
				given().
				param("id","3").
				when().
				get(url);
		
		System.out.println(response.asString());
	}
//	@Test
//	public void postComplexPost(){
//		Address adress = new Address("palenko","7b","Kiev","09646");
//		Person newPerson = new Person("2","Olga Kh","you2",adress);
//		Response response=
//		given().
//		when().
//		contentType(ContentType.JSON).
//		body(newPerson).
//		post("http://localhost:3000/posts");
//		
//		System.out.println(response.asString());
//		
//	}
	
	@Ignore
	@Test
	public void deleteComplexPost(){
		Response response=
		given().
		param("id","2").
		when().
		delete("http://localhost:3000/posts/2");
		System.out.println(response.asString());
	}
	
	@Test
	public void postComplexPost(){
		Address[] adress = { new Address("palenko", "7b", "Kiev", "09646"),
				new Address("kudulo", "5b", "Kiev", "345") };
		
		Person newPerson = new Person("3","milko","kuku",adress);
		Response response=
		given().
		when().
				contentType(ContentType.JSON).
				body(newPerson).
				post("http://localhost:3000/posts");
	
		Long id = new Long(response.body().jsonPath().getInt("id"));

		
		System.out.println(response.asString());
		System.out.println(response.statusCode());
	
	}
	
	
	
}
