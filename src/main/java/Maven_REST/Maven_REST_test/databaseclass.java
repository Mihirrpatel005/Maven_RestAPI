package Maven_REST.Maven_REST_test;

import java.util.HashMap;
import java.util.Map;

public class databaseclass {

	private static Map<Long, message> message = new HashMap<Long, Maven_REST.Maven_REST_test.message>();
	private static Map<String, profile> profile = new HashMap<String, Maven_REST.Maven_REST_test.profile>();

	public static Map<Long, message> getmsg() {
		return message;
	}

	public static Map<String, profile> getprofile() {
		return profile;
	}

}
