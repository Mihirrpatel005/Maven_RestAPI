package Maven_REST.Maven_REST_test;

import java.util.List;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	messageservice ms = new messageservice();

	@GET
	public List<message> getMessage(@QueryParam("year") int year,@QueryParam("start") int start,@QueryParam("size") int size) {
		if (year > 0) {
			return ms.getallmessageforyear(year);
		}
		if (start >= 0 && size >= 0) {
			return ms.getallmessagepaginated(start, size);
		}
		return ms.getallmessage();
	}

	@POST
	public message ADDMessage(message msg) {
		// return "Hello message...!!!!!!";
		return ms.addmessage(msg);
	}

	@PUT
	@Path("/{id}")
	public message putMessage(@PathParam("id") long id, message msg) {
		msg.setId(id);
		return ms.updatemessage(msg);
	}

	@DELETE
	@Path("/{id}")
	public void deleteMessage(@PathParam("id") long id) {
		ms.removemessage(id);
	}

	@GET
	@Path("/{id}")
	public message getMessageid(@PathParam("id") long id) {
		// return "Hello message...!!!!!!";
		return ms.getmessage(id);
	}

}
