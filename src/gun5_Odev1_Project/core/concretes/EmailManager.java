package gun5_Odev1_Project.core.concretes;

import gun5_Odev1_Project.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifactionEmail(String ePosta) {
		System.out.println(ePosta
				+ " E-posta adresinize do�rulama kodu g�nderildi. Hesab�n�z� aktifle�tirmek i�in kodu do�rulay�n");

	}

}
