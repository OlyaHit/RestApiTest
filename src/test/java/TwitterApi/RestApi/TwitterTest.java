package TwitterApi.RestApi;
import static io.restassured.RestAssured.given;

import org.junit.*;

import helpers.TwitterOauth;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import static io.restassured.RestAssured.*;

public class TwitterTest {
	public String urlStatus = "https://api.twitter.com/1.1/statuses/update.json";
	public String key = "uVpQ59LNxIZs1eG017csljeUh";
	public String secret = "mh7EjVK6ocoUSGp8kiIHNSLTrW7bEsn2VnF7Yo6hXEkFt6SOqN";
	public String accesskey = "904303774965133312-Ot2ROJpLeluhYufn6K9T7J8PrnUO15S";
	public String accesssecret = "rxhaf4YfieCefB1KjppacgsLdtXglQMdILnTSe5ugbe5E";
	

	@Test 
	public void firstTest() {
		Response response=
				given().
				auth().oauth(key, secret, accesskey, accesssecret).
				when().
				contentType(ContentType.JSON).
				body("hello")
				.post(urlStatus);
	
				System.out.println(response.asString());
		
	}
}
