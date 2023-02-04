package PolicedriverApi;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ERA.base.Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Driver_Login_Test extends Base{

	static String access_token;

	//@Test(dataProvider = "driverdata", priority = 1)
	
	/**
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * @param access_token the access_token to set
	 */
	public void setAccess_token(String access_token) {
		API_Driver_Login_Test.access_token = access_token;
	}

	@Test(priority = 1)
	public void driverLogin() throws IOException {

		String driverBaseURL = (String) new driverApi.API_GetBaseURLTest().GetrdriverBaseUrl();
////////////////////////////////Get Request///////////////////////////////////	
		
	////////////////dev///////////////////////
//		RestAssured.baseURI =driverBaseURL + "/api/v1/user";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response res = httpRequest
//				.queryParam("login_id", "0501234563")
//				.queryParam("gx", "30.239421666666665")
//				.queryParam("password", "123456")
//				.queryParam("gy", "31.483515000000004")
//				.queryParam("device_id", "3920bb4aaafb213f")
//				.queryParam("fcm_key", "eqZPPdoiTOS_UnBDsRxLoD%3AAPA91bEnMZf1NksCH-HlkkAXaKO_o1vGQ2ssBLLC4ens7xVi3ZbeRYbPehPANKOyWW8mR65kh7xKUfWoFJX5j8egn81w4nVfgl55z6MwDcj2r4CaFhuu_FuDj1UCtbiejXf2vWeV8Arg")
//				.get("/login");
/////////////////////live/////////////////////////
		RestAssured.baseURI =driverBaseURL + "/api/v1/user";
		RequestSpecification httpRequest = RestAssured.given();
		String driverUser = (String) new API_GetBaseURLTest().getdriveraccount();

		Response res = httpRequest
				.queryParam("login_id", driverUser)
				.queryParam("gx", "30.239421666666665")
				.queryParam("password", "123456")
				.queryParam("gy", "31.483515000000004")
				.queryParam("device_id", "3920bb4aaafb213f")
				.queryParam("fcm_key", "fY0xVzqvTRa_SUgK9G-GmG%3AAPA91bG-MshGa6m4CaD1s0K44pCF3Eb2ST_OKZcZWTqAavc_XhPG5BCFTz-FxlTUwxnrSG8dXHSiwUCazw25c3NRlJBxiVOa6c2oqZuSdA8d2OYR0MUQp_dV2xj0o-C78LYmIZGyOPqT")
				.get("/login");

////////////////////////////////Response ///////////////////////////////////
		String responsebody1 = res.getBody().asString();
		JsonPath jpath = new JsonPath(responsebody1);
		  access_token = jpath.getString("access_token");
		System.out.println("access_token is  - " + access_token);
		JsonPath path = new JsonPath(responsebody1);
		boolean Success = path.get("success");
		
		Assert.assertEquals(Success, true);

		//return access_token;
	}
}
