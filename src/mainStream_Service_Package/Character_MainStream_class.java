package mainStream_Service_Package;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Character_MainStream_class {
	public static int statusCode(String baseURI,String resource)
	{
		RestAssured.baseURI=baseURI;
		//int statusCode=given().queryParam("name","Rick's Memories").get(resource).then().extract().statusCode();
		int statusCode=given().header("Postman-Token","<calculated when request is sent>").get(resource).then().extract().statusCode();
		return statusCode;
	}
	public static String responsBody(String baseURI,String resource)
	{
		RestAssured.baseURI=baseURI;
		//String responsBody=given().queryParam("name","Rick's Memories").get(resource).then().extract().response().asString();
		String responsBody=given().header("Postman-Token","<calculated when request is sent>").get(resource).then().extract().response().asString();
		return responsBody;
	}
}
