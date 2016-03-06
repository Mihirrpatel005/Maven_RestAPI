package Maven_REST.Maven_REST_test;

import java.util.List;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Profileresource {

	profileservice ps = new profileservice();

	@GET
	public List<profile> getprofile() {
		return ps.getallprofile();
	}

	@POST
	public profile ADDprofile(profile psg) {
		// return "Hello message...!!!!!!";
		return ps.addprofile(psg);
	}

	@PUT
	@Path("/{profileid}")
	public profile putprofile(@PathParam("profileid") String profile, profile profilename) {
		profilename.setProfilename(profile);
		return ps.updateprofile(profilename);
	}

	@DELETE
	@Path("/{profileid}")
	public void deleteprofile(@PathParam("profileid") String profilename) {
		ps.removeprofile(profilename);
	}

	@GET
	@Path("/{profileid}")
	public profile getprofileid(@PathParam("profileid") String profilename) {
		// return "Hello message...!!!!!!";
		return ps.getprofile(profilename);
	}

}
