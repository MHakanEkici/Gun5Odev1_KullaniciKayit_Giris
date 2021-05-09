package gun5_Odev1_Project;

import gun5_Odev1_Project.business.concretes.UserManager;
import gun5_Odev1_Project.business.concretes.UserValidatorManager;
import gun5_Odev1_Project.core.concretes.EmailManager;
import gun5_Odev1_Project.dataAccess.concretes.HibernateUserDao;
import gun5_Odev1_Project.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setFirstName("Hakan");
		user1.setLastName("Ekici");
		user1.setePosta("Hakan123@mail.com");
		user1.setPassword("123456789");

		User user2 = new User();
		user2.setFirstName("Süleyman");
		user2.setLastName("Salla");
		user2.setePosta("Hakan123@mail.com");
		user2.setPassword("abcdefgh");

		UserManager userManager = new UserManager(new UserValidatorManager(), new HibernateUserDao(),
				new EmailManager());

		// kayýt user1
		boolean isRegistered = userManager.register(user1);

		// aktifleþtirme 1
		if (isRegistered) {
			userManager.verify(user1);
		}
		
		// silme 
		//userManager.delete(user1);
		
		// giriþ
		userManager.logIn(user1);

		System.out.println("-------------------------------------------");
		
		// kayýt user2
		boolean isRegistered2 = userManager.register(user2);

		// aktifleþtirme 2
		if (isRegistered2) {
			userManager.verify(user2);
		}
		
		//giriþ 2
		userManager.logIn(user2);

	}

}
