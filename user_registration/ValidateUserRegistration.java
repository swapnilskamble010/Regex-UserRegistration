package regex.user_registration;

import java.util.regex.Pattern;

public class ValidateUserRegistration {
	IValidateUserDetail validateUser = (userDetails, pattern)->Pattern.matches(userDetails, pattern);
		

	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		System.out.println(validateUser.userValidation(firstName,firstNamePattern ));
		if (validateUser.userValidation(firstName,firstNamePattern )) {
			return true;
		} else {
			throw new UserRegistrationException("Enter valid firstName", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
		}
	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		if (validateUser.userValidation(lastName, lastNamePattern )) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid lastName", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
		}
	}

	public boolean validateEmail(String emailId) throws UserRegistrationException {
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		if (validateUser.userValidation(emailId, emailPattern)) {
			return true;
		} else {
			throw new UserRegistrationException("Enter valid emailId", UserRegistrationException.ExceptionType.INVALID_EMAIL);
		}
	}

	public boolean validaeMobileNum(String mobNumber) throws UserRegistrationException {
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		if (validateUser.userValidation(mobNumber,mobNumberPattern )) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid mobNumber", UserRegistrationException.ExceptionType.INVALID_MOBILE);
		}
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		if (validateUser.userValidation(password,passwordPattern )) {
			return true;
		} else {
			throw new UserRegistrationException("Enter valid password", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}
}
