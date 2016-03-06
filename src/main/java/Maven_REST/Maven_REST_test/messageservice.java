package Maven_REST.Maven_REST_test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class messageservice {

	private Map<Long, message> message = databaseclass.getmsg();

	public messageservice() {
		message.put(1l, new message(1, "mihir", "patel"));
		message.put(2l, new message(2, "mihir2", "patel2"));
	}

	public List<message> getallmessage() {

		/*
		 * message m1= new message(1L,"mihir","mihirauthor"); message m2= new
		 * message(2L,"mihir2","mihirauthor2");
		 * 
		 * List<message> list= new ArrayList<message>(); list.add(m1);
		 * list.add(m2);
		 * 
		 * return list;
		 */

		return new ArrayList<message>(message.values());

	}

	public List<message> getallmessageforyear(int year) {

		List<message> messageyear = new ArrayList<message>();
		Calendar cal = Calendar.getInstance();
		for (message msg : message.values()) {
			cal.setTime(msg.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messageyear.add(msg);
			}
		}
		return messageyear;
	}

	public List<message> getallmessagepaginated(int start, int size) {

		ArrayList<message> list = new ArrayList<message>();
		if (start + size > list.size())
			return new ArrayList<message>();
		return list.subList(start, start + size);

	}

	public message getmessage(long id) {
		return message.get(id);

	}

	public message addmessage(message msg) {
		msg.setId(message.size() + 1);
		message.put(msg.getId(), msg);
		return msg;

	}

	public message updatemessage(message msg) {

		if (msg.getId() <= 0) {
			return null;

		}
		message.put(msg.getId(), msg);
		return msg;
	}

	public void removemessage(long id) {
		message.remove(id);

	}

}
