package regex.user_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);

	public void validateFirstName() {
		System.out.print("Enter first Name : ");
		String firstName = sc.next();
		if(firstName.matches("^[A-Z]{1}[A-Za-z]{2,}$")){
			System.out.println(firstName + " -\tvalidation success..!");
		}
		else {
			System.out.println(firstName + " -\tvalidation unsuccessful..!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Validation Program");

		UserRegistrationMain userRegistration = new UserRegistrationMain();
		userRegistration.validateFirstName();
	}
}
