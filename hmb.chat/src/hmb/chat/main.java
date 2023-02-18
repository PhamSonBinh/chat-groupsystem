package hmb.chat;

import java.util.List;

import com.hmb.chat.entity.User;
import com.hmb.chat.repository.UserRepository;

public class main {

	public static void main(String[] args) {
		User fakeUsers1 = new User("firstName1", "lastName1", "userId1", "userName1", "password1", "gender1",
				"dateOfBirth1");
		User fakeUsers2 = new User("firstName2", "lastName2", "userId2", "userName2", "password2", "gender2",
				"dateOfBirth2");
		User fakeUsers3 = new User("firstName3", "lastName3", "userId3", "userName3", "password3", "gender3",
				"dateOfBirth3");
		UserRepository obj = new UserRepository();
		obj.add(fakeUsers1);
		obj.add(fakeUsers2);
		obj.add(fakeUsers3);
		List<User> userlist = obj.getAll();
		for (User u : userlist) {
			System.out.println(u.getUserName());
		}
	}

}
