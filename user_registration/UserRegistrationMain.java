package regex.user_registration;

import java.util.Scanner;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);

	private void validateFirstName() {
		System.out.print("Enter your First Name : ");
		String firstName = sc.next();
		String firstNamePattern = "^[A-Z]{1}[A-Za-z]{2,}$";
		validation(firstName, firstNamePattern);
	}

	private void validateLastName() {
		System.out.print("Enter your Last Name : ");
		String lastName = sc.next();
		String lastNamePattern = "^[A-Z]{1}[A-Za-z]{2,}$";
		validation(lastName, lastNamePattern);
	}

	private void validateEmail() {
		System.out.print("Enter your Email ID : ");
		String emailID = sc.next();
		String emailPattern = "^[A-Za-z0-9]+[.(A-Za-z0-9)]*@[a-zA-Z]+[.][a-zA-Z]+[.(A-Za-z)]*$";
		validation(emailID, emailPattern);
	}

	private void validateMobileFormat() {
		System.out.print("Enter your Mobile Number : ");
		String mobileNumber = sc.nextLine();
		String mobilePattern = "^[0-9]{2}[\\s][0-9]{10}$";
		validation(mobileNumber, mobilePattern);
	}

	private void validatePassword() {
		System.out.print("Enter your Password : ");
		String password = sc.nextLine();
		String passwordPattern = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,})$";  
		validation(password, passwordPattern);	
	}

	private void validation(String userInput, String pattern ) {
		if(userInput.matches(pattern)){
			System.out.println(userInput + " -\tvalidation success..!");
		}
		else {
			System.out.println(userInput + " -\tvalidation unsuccessful..!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Validation Program");

		UserRegistrationMain userRegistration = new UserRegistrationMain();
		userRegistration.validateFirstName();
		userRegistration.validateLastName();
		userRegistration.validateEmail();
		userRegistration.validateMobileFormat();
		userRegistration.validatePassword();
	}
}
