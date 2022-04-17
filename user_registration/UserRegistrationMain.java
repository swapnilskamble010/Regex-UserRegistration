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

	private void validateEmail(String[] emailSample) {
		for(int i = 0; i < emailSample.length; i++) {
			String emailPattern = "^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";
			validation(emailSample[i], emailPattern);
		}
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
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";  
		validation(password, passwordPattern);	
	}

	private void validation(String userInput, String pattern ) {
		if(userInput.matches(pattern)){
			System.out.println("'" + userInput + "'" + " - \tvalidation success..!");
		}
		else {
			System.out.println("'" + userInput + "'" + " - \tvalidation unsuccessful..!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Validation Program");
		String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
		String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		UserRegistrationMain userRegistration = new UserRegistrationMain();
		userRegistration.validateFirstName();
		userRegistration.validateLastName();
		userRegistration.validateEmail(validEmailSample);
		userRegistration.validateEmail(invalidEmailSample);
		userRegistration.validateMobileFormat();
		userRegistration.validatePassword();
	}
}
