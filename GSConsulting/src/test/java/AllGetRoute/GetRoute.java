package AllGetRoute;

public class GetRoute {
	
	public static String base_url = "https://httpbin.org";
	
	//HTTP methods module
	public static String  HTTP_get_url = base_url + "/get";
	
	//Auth module
	public static String  Auth_get_url = base_url + "/basic-auth/{user}/{passwd}";
	//"/bearer"
	//"/digest-auth/{qop}/{user}/{passwd}"
	//"/digest-auth/{qop}/{user}/{passwd}/{algorithm}"
	//"/digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after}"
	//"/hidden-basic-auth/{user}/{passwd}"
	
	//Status code module
	//"/status/{codes}"
	
	//you can find out same for other module inside the base url

}
