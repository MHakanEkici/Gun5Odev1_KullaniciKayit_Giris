package gun5_Odev1_Project.business.abstracts;

import gun5_Odev1_Project.entities.concretes.User;

public interface UserService {
	
	void delete(User user);
	boolean register(User user);
	void logIn(User user);
	void verify(User user);
	

}
