package regex.user_registration;

import java.util.regex.Pattern;

public class UserRegistrationMain {

	private static final String NAME = "^[A-Z]{1}[A-Za-z]{2,}$";
	private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	private static final String MOBILE_NUMBER = "^[0-9]{2}[\\s][0-9]{10}$";
	private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

	public boolean validateFirstName(String firstName) {
		return Pattern.matches(NAME, firstName);
	}

	public boolean validateLastName(String lastName) {
		return Pattern.matches(NAME, lastName);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(EMAIL, email);
	}

	public boolean validateMobileNumber(String mobileNumber) {
		return Pattern.matches(MOBILE_NUMBER, mobileNumber);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(PASSWORD, password);
	}
}
