package gun5_Odev1_Project.core.concretes;

import gun5_Odev1_Project.core.abstracts.GoogleService;
import gun5_Odev1_Project.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void logInWithGmail() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.logInGmail();
		
	}

}
