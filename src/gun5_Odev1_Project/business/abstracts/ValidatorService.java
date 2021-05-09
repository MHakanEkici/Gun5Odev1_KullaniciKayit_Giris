package gun5_Odev1_Project.business.abstracts;

import gun5_Odev1_Project.dataAccess.abstracts.UserDao;
import gun5_Odev1_Project.entities.concretes.User;

public interface ValidatorService {
	
	boolean isValidUserInfo(User user);
	boolean isValidEmailAdress(String ePosta);
	boolean isValidPassword(String password);
	boolean isUserExist(String ePosta, UserDao userDao);
	
	
	
	

}
