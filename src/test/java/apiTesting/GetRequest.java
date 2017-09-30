package apiTesting;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import TwitterApi.RestApi2.Person2;
import TwitterApi.RestApi2.Address;
import org.junit.*;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetRequest {
public String url ="http://samples.openweathermap.org/data/2.5/weather";
public String url2= "http://localhost:3000/posts";	
	@Ignore
	@Test
	public void getRequestByCityNameTest() {
		given().
		param("q", "London").
		param("appid","b1b15e88fa797225412429c1c50c122a1").
		when().
		get(url).
		then().
		assertThat().statusCode(200);
	}
	@Ignore
	@Test
	public void getRequestByCityIdTest() {
		Response resp=
		given().
		param("id","2172797").
		param("appid","b1b15e88fa797225412429c1c50c122a1").
		when().
		get(url);
	
	assertEquals(200,resp.getStatusCode());
	System.out.println(resp.asString());	
	}
	
	@Test
	public void getRequestExtractResult(){
		Response response=
				given().
				param("id","2172797").
				param("appid","b1b15e88fa797225412429c1c50c122a1").
				when().
				get(url);
		
		String actualResult=response.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println(actualResult);
		String expectedResult="scattered clouds";
		
		assertEquals(expectedResult,actualResult);
	
}
	//Parse Json to JavaObject
	@Ignore
	@Test
	public void getRequestJavaObjectMap () {
		Response response =
				given().
				when().
				get(url2);
		System.out.println(response.asString());
		
		 String street = "LeanneGraham";
		 String suite = "dff";
		 String city = "KIev";
		
		Person2 personObj = response.as(Person2.class, ObjectMapperType.GSON);
		List<Address> items = personObj.getAddress();
		for (Address allItems: items){
			Assert.assertEquals(street,allItems.getStreet());
			Assert.assertEquals(suite,allItems.getSuite());
			Assert.assertEquals(city,allItems.getCity());
		}
		
				//Person personObj = response.as(Person.class);
				//Assert.assertEquals(expctedName,items.getName());
				//Assert.assertArrayEquals(expectedAddress, personObj.getAddress());
	}
}