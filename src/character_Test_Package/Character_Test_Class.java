package character_Test_Package;
import org.testng.Assert;
import io.restassured.path.json.JsonPath;
import mainStream_Service_Package.Character_MainStream_class;
import storehouse_Character_Package.Chracter_Storehouse_Class;

public class Character_Test_Class {
	public static void execute() {
		String baseURI=Chracter_Storehouse_Class.baseURI();
		String resource=Chracter_Storehouse_Class.resource();
		
		int statusCode=Character_MainStream_class.statusCode(baseURI,resource);
		String responsBody=Character_MainStream_class.responsBody(baseURI,resource);
		
		
		JsonPath jsp=new JsonPath(responsBody);
		 int res_id=jsp.getInt("id");
		 String res_name=jsp.getString("name");
		 String res_type=jsp.getString("type");
		 String res_dimension=jsp.getString("dimension"); 
		String exp_residents=jsp.getString("residents");
		 
		 
		 Assert.assertEquals(statusCode, 200);
	      Assert.assertNotNull(res_name);
	      Assert.assertNotNull(res_id);
	      Assert.assertNotNull(res_type);
	      Assert.assertNotNull(res_dimension);
	      Assert.assertNotNull(exp_residents);
	   
		  System.out.println("rickandmortyapi.com-location "+responsBody);
		 
	}

}
