package Maven_REST.Maven_REST_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class profileservice {

	private Map<String, profile> profile1 = databaseclass.getprofile();

	public profileservice() {
		profile1.put("mihir", new profile(1l, "mihir", "patel", "abc"));
		profile1.put("shweta", new profile(2l, "mihir2", "patel2", "ghj"));
	}

	public List<profile> getallprofile() {
		return new ArrayList<profile>(profile1.values());

	}

	public profile getprofile(String prname) {
		return profile1.get(prname);

	}

	public profile addprofile(profile psg) {
		psg.setId(profile1.size() + 1);
		profile1.put(psg.getProfilename(), psg);
		return psg;

	}

	public profile updateprofile(profile psg) {

		if (psg.getProfilename().isEmpty()) {
			return null;

		}
		profile1.put(psg.getProfilename(), psg);
		return psg;
	}

	public void removeprofile(String profilename) {
		profile1.remove(profilename);

	}

}
