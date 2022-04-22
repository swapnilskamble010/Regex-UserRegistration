package regex.user_registration_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import regex.user_registration.UserRegistrationException;
import regex.user_registration.ValidateUserRegistration;

class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean first_name;
		try {
			first_name = userValidation.validateFirstName("Swapnil");
			Assert.assertEquals(expectedValue, first_name);	
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = false;
		boolean first_name;
		try {
			first_name = userValidation.validateFirstName("swapnil@");
			Assert.assertEquals(expectedValue, first_name);	
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean last_name;
		try {
			last_name = userValidation.validateLastName("Kamble");
			Assert.assertEquals(expectedValue, last_name);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenLaststName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = false;
		boolean last_name;
		try {
			last_name = userValidation.validateFirstName("kamble1");
			Assert.assertEquals(expectedValue, last_name);
		}
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validateEmailAddress_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean email;
		try {
			email = userValidation.validateEmail("swapnil@gmail.com");
			Assert.assertEquals(expectedValue, email);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validateEmailAddress_WhenNotValid_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean email;
		try {
			email = userValidation.validateEmail("abc#gmail.com");
			Assert.assertEquals(expectedValue, email);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validateMobileNo_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean phoneNo;
		try {
			phoneNo = userValidation.validaeMobileNum("91 8888777744");
			Assert.assertEquals(expectedValue, phoneNo);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validateMobileNo_WhenShort_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = false;
		boolean phoneNo;
		try {
			phoneNo = userValidation.validaeMobileNum("91 839379");
			Assert.assertEquals(expectedValue, phoneNo);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validatePassword_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = true;
		boolean password;
		try {
			password = userValidation.validatePassword("SwS@sff223");
			Assert.assertEquals(expectedValue, password);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = false;
		boolean password;
		try {
			password = userValidation.validatePassword("wret@sff223");
			Assert.assertEquals(expectedValue, password);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		boolean expectedValue = false;
		boolean password;
		try {
			password = userValidation.validatePassword("SS@asdf");
			Assert.assertEquals(expectedValue, password);
		} 
		catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}