package trelloAPI;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import trelloConfig.BoardCheckList;
import trelloConfig.CheckList;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
public class TrelloGetTest {
	public String url ="https://api.trello.com/1/boards";
	@Ignore
	@Test
	public void getBoardName(){
		Response response=
		given().
		pathParam("id", "FnUX37kg").
		pathParam("field", "name").
		queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
		queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
		when().
		get("https://api.trello.com/1/boards/{id}/{field}");
		
		response.then().body("_value", equalTo("myLIST"));
		System.out.println(response.asString());	
	}
	@Ignore
	@Test
	public void getBoardStarts(){
		Response response=
				given().
				pathParam("id", "FnUX37kg").
				queryParam("fields", "id").
				queryParam("boardStars", "mine").
				queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
				queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
				when().
				get("https://api.trello.com/1/boards/{id}");
		
		response.then().body("id", containsString("84116"));
		System.out.println(response.asString());	
	}
	@Ignore
	@Test
	public void getBordCheckList(){
		Response response=
				given().
				pathParam("id", "FnUX37kg").
				pathParam("field", "checklists").
				queryParam("checkItem_fields", "name").
				queryParam("fields", "name").
				queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
				queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
				when().
				get("https://api.trello.com/1/boards/{id}/{field}");
		
		assertEquals(200,response.getStatusCode());
		
		BoardCheckList[] board = response.as(BoardCheckList[].class, ObjectMapperType.GSON);
		for(BoardCheckList checks: board ){
			System.out.println(checks.getId());
			assertThat(checks.getId(), equalTo("59b27a6373f486ee82203875"));
			assertThat(checks.getName(),equalTo("myChecks"));
			assertThat(checks.getCheckItems(),arrayWithSize(4));
		}
		
		System.out.println(response.asString());
	}
	@Ignore
	@Test
	public void getList(){
		Response response=
				given().
				pathParam("id", "FnUX37kg").
				pathParam("field", "lists").
				queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
				queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
				when().
				get("https://api.trello.com/1/boards/{id}/{field}");
		assertEquals(200,response.getStatusCode());
		
		CheckList[] checks = response.as(CheckList[].class, ObjectMapperType.GSON);
		List<CheckList> checksListM = new ArrayList<CheckList>(Arrays.asList(checks));
		assertThat(checks,arrayWithSize(3));
		CheckList expected = new CheckList("59b24bf9e43dfe3b56584117", "Нужно сделать",
				false, "59b24bf9e43dfe3b56584116", 16384, false);
				
		Assert.assertTrue(checksListM.get(0).equals(expected));
		System.out.println(response.asString());
	}
	@Ignore
	@Test
	public void getListValidate(){
		Response response=
				given().
				pathParam("id", "FnUX37kg").
				pathParam("field", "lists").
				queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
				queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
				when().
				get("https://api.trello.com/1/boards/{id}/{field}");
		assertEquals(200,response.getStatusCode());
		
		CheckList[] checks = response.as(CheckList[].class, ObjectMapperType.GSON);
		List<CheckList> checksListM = new ArrayList<CheckList>(Arrays.asList(checks));
		Set<String> expectedValues = new HashSet<String>(Arrays.asList("Нужно сделать", "В процессе", "Готово"));
		assertEquals(expectedValues, 
				checksListM.stream().map(CheckList::getName).collect(Collectors.toSet()));
		CheckList expected = new CheckList("59b24bf9e43dfe3b56584117", "Нужно сделать",
				false, "59b24bf9e43dfe3b56584116", 16384, false);
				
		 assertThat(checksListM.get(0), equalTo(expected));
		 System.out.println(checksListM.get(0).toString());
	}
	
	@Test
	public void getListValidateArrays(){
		Response response=
				given().
				pathParam("id", "FnUX37kg").
				pathParam("field", "lists").
				queryParam("token","772bd656d696570c8a001b6d8499bb60b08fdc604f77a8b26dd550fe23b43303").
				queryParam("key", "8e38ca0aae0df85f1c7353a6c73188d0").
				when().
				get("https://api.trello.com/1/boards/{id}/{field}");
		assertEquals(200,response.getStatusCode());
		
		CheckList[] checksActual = response.as(CheckList[].class, ObjectMapperType.GSON);
		CheckList[] checksExpected = { 
				new CheckList("59b24bf9e43dfe3b56584117", "Нужно сделать",
						false, "59b24bf9e43dfe3b56584116", 16384, false),
				new CheckList("59b24bf9e43dfe3b56584118", "В процессе",
						false, "59b24bf9e43dfe3b56584116", 32768, false),
				new CheckList("59b24bf9e43dfe3b56584119", "Готово",
						false, "59b24bf9e43dfe3b56584116", 49152, false)
		};
		
		//Assert.assertArrayEquals(checksExpected,checksActual);
		assertThat(checksActual,is(checksExpected));
}
}
