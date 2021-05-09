package gun5_Odev1_Project.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun5_Odev1_Project.dataAccess.abstracts.UserDao;
import gun5_Odev1_Project.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<User> userList;
	
	public HibernateUserDao() {
		super();
		this.userList = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		user.setActive(false);
		userList.add(user);
		
	}

	@Override
	public void delete(User user) {
		userList.remove(user);
		
	}

	@Override
	public void verifyUser(User updatedUser) {
		for (User user: userList) {
			if(user.getePosta().equals(updatedUser.getePosta())) {
				user.setActive(true);
			}
			
		}
		
	}

	@Override
	public List<User> userList() {
		return userList;
	}

	
}
