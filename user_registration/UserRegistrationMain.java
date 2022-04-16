package regex.user_registration;

import java.util.Scanner;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);

	private void validateFirstName() {
		System.out.print("Enter your First Name : ");
		String firstName = sc.next();
		if(firstName.matches("^[A-Z]{1}[A-Za-z]{2,}$")){
			System.out.println(firstName + " -validation success..!");
		}
		else {
			System.out.println(firstName + " -validation unsuccessful..!");
		}
	}

	private void validateLastName() {
		System.out.print("Enter your Last Name : ");
		String lastName = sc.next();
		if(lastName.matches("^[A-Z]{1}[A-Za-z]{2,}$")){
			System.out.println(lastName + " -\tvalidation success..!");
		}
		else {
			System.out.println(lastName + " -\tvalidation unsuccessful..!");
		}
	}
	
	private void validateEmail() {
		System.out.print("Enter your Email ID : ");
		String emailID = sc.next();
		if(emailID.matches("^[A-Za-z0-9]+[.(A-Za-z0-9)]*@[a-zA-Z]+[.][a-zA-Z]+[.(A-Za-z)]*$")){
			System.out.println(emailID + " -\tvalidation success..!");
		}
		else {
			System.out.println(emailID + " -\tvalidation unsuccessful..!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Validation Program");

		UserRegistrationMain userRegistration = new UserRegistrationMain();
		userRegistration.validateFirstName();
		userRegistration.validateLastName();
		userRegistration.validateEmail();
	}
}
