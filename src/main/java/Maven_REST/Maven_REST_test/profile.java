package Maven_REST.Maven_REST_test;

import java.util.Date;

public class profile {

	private long id;
	private String profilename;
	private String fname;
	private String lname;

	public profile() {

	}

	public profile(long id, String profilename, String fname, String lname) {

		this.id = id;
		this.profilename = profilename;
		this.fname = fname;
		this.lname = lname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfilename() {
		return profilename;
	}

	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
