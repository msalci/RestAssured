package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import org.apache.log4j.Logger;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class ResqTest {
Logger log = Logger.getLogger(ResqTest.class);

@Test
public static void main(String[] args) {
	RestAssured.baseURI = "https://reqres.in/api";
	String reqsbody = "{\n" +
			"    \"name\": \"morpheus\",\n" +
			"    \"job\": \"leader\"\n" +
			"}";

	Response resp = RestAssured.given().log().all().contentType(ContentType.JSON).body(reqsbody).post("users");

	resp.then().assertThat().statusCode(201).and().body("createdAt",notNullValue());
}

@Test
public void createUserTest() {
	RestAssured.baseURI = "https://reqres.in/api";
	String reqsbody = "{\n" +
			"    \"name\": \"morpheus\",\n" +
			"    \"job\": \"leader\"\n" +
			"}";

	Response resp = RestAssured.given().log().all().contentType(ContentType.JSON).body(reqsbody).post("users");

	resp.then().log().all().assertThat().statusCode(201).and().body("createdAt",notNullValue());


}
@Test
public void listUserTest() {
	RestAssured.baseURI = "https://reqres.in/api";

	Response resp = RestAssured.given().log().all().get("unknown");

	resp.then().log().all().statusCode(200).and().assertThat().body("total", equalTo(12) );

}

@Test
public void listUserTest2() {
	RestAssured.baseURI = "https://reqres.in/api";

	Response resp = RestAssured.given().log().all().get("unknown");

	JsonPath jpath = resp.jsonPath();
	String data = jpath.getString("data.name");
	System.out.println(data);
    //we don't use response because we imported static Hamcrest Matcher
	assertThat(data, containsString("aqua sky"));

	//if we use junit assertion looks like following
	List<String> bodySize = jpath.getList("data");
//	log.info("Test passed");
	Assert.assertEquals( 5, bodySize.size());

}
@Test
public void test3() {
	Assert.assertEquals(1, 2);
}
}
