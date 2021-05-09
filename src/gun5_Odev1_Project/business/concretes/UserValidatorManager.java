package gun5_Odev1_Project.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5_Odev1_Project.business.abstracts.ValidatorService;
import gun5_Odev1_Project.dataAccess.abstracts.UserDao;
import gun5_Odev1_Project.entities.concretes.User;

public class UserValidatorManager implements ValidatorService {

	@Override
	public boolean isValidUserInfo(User user) {
		if (user.getFirstName() == null || user.getLastName() == null || user.getePosta() == null
				|| user.getPassword() == null) {
			return false;
		} else if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			return false;
		}
		
		else {
			return true;
		}
	}

	@Override
	public boolean isValidEmailAdress(String ePosta) {
		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(ePosta);
		return matcher.matches();

	}

	@Override
	public boolean isValidPassword(String password) {
		if (password.length() < 6) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isUserExist(String ePosta, UserDao userDao) {
		for (User user : userDao.userList()) {
			if (user.getePosta().equals(ePosta)) {
				return false;
			}
			
		}
		
		return true;
		
	}

}
