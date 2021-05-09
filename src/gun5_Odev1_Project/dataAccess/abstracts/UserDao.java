package gun5_Odev1_Project.dataAccess.abstracts;

import java.util.List;

import gun5_Odev1_Project.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void verifyUser(User user);
	List<User> userList();
}
