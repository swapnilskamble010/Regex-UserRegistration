package regex.user_registration;

import java.util.regex.Pattern;

public class ValidateUserRegistration {
	
	public String validateFirstName(String firstName) {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		return validation(firstNamePattern, firstName);
	}

	public static String validateLastName(String lastName) {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		return validation(lastNamePattern, lastName);
	}

	public static String validateEmail(String emailId) {
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		Pattern pattern = Pattern.compile(emailId);
		if (emailId.matches(emailPattern)) { // check Input and Pattern
			return "Happy";
		}
		else {
			return "Sad";
		}
	}

	public String validaeMobileNum(String mobNumber) {
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		return validation(mobNumberPattern, mobNumber);
	}

	public String validatePassword(String password) {
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		return validation(passwordPattern, password);
	}

	public static String validation(String checkPattern, String UserInput) {
		Pattern pattern = Pattern.compile(UserInput);
		if (UserInput.matches(checkPattern)) { 
			return "Happy";
		}
		else {
			return "Sad";
		}
	}

}
