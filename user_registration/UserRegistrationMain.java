package regex.user_registration;

import java.util.Scanner;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);

	public void validateFirstName() {
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

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Validation Program");

		UserRegistrationMain userRegistration = new UserRegistrationMain();
		userRegistration.validateFirstName();
		userRegistration.validateLastName();
	}
}
