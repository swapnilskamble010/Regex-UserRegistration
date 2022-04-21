package regex.user_registration;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		System.out.println("Welcome message to user registration program");
		Scanner scan = new Scanner(System.in);
		ValidateUserRegistration validate = new ValidateUserRegistration();
		System.out.println("Enter First name: ");
		String firstName = scan.nextLine();
		System.out.println(firstName);
		try {
			validate.validateFirstName(firstName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter Last name: ");
		String lastName = scan.nextLine();
		System.out.println(lastName);
		try {
			validate.validateFirstName(lastName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter Email Id: ");
		String emailId = scan.nextLine();
		System.out.println(emailId);
		try {
			validate.validateEmail(emailId);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter mobile number: ");
		String mobNumber = scan.nextLine();
		System.out.println(mobNumber);
		try {
			validate.validaeMobileNum(mobNumber);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter password minimum 8 character having at least one upper case , one numeric number and one special character: ");
		String password = scan.nextLine();
		System.out.println(password);
		try {
			validate.validatePassword(password);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}
