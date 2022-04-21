package regex.user_registration_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import regex.user_registration.UserRegistrationMain;
import regex.user_registration.ValidateUserRegistration;

class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String first_name = userValidation.validateFirstName("Swapnil");
		Assert.assertEquals(expectedValue, first_name);
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String first_name = userValidation.validateFirstName("swapnil3");
		Assert.assertEquals(expectedValue, first_name);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String last_name = userValidation.validateLastName("Kamble");
		Assert.assertEquals(expectedValue, last_name);
	}

	@Test
	public void givenLaststName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String last_name = userValidation.validateFirstName("kamble6");
		Assert.assertEquals(expectedValue, last_name);
	}

	@Test
	public void validateEmailAddress_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String email = userValidation.validateEmail("swapnil@gmail.com");
		Assert.assertEquals(expectedValue, email);
	}

	@Test
	public void validateEmailAddress_WhenNotValid_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String email = userValidation.validateEmail("abc#gmail.com");
		Assert.assertEquals(expectedValue, email);
	}

	@Test
	public void validateMobileNo_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String phoneNo = userValidation.validaeMobileNum("91 8888777744");
		Assert.assertEquals(expectedValue, phoneNo);
	}

	@Test
	public void validateMobileNo_WhenShort_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String phoneNo = userValidation.validaeMobileNum("91 839379");
		Assert.assertEquals(expectedValue, phoneNo);
	}

	@Test
	public void validatePassword_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String password = userValidation.validatePassword("SwS@sff223");
		Assert.assertEquals(expectedValue, password);
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String password = userValidation.validatePassword("wret@sff223");
		Assert.assertEquals(expectedValue, password);
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String password = userValidation.validatePassword("SS@asdf");
		Assert.assertEquals(expectedValue, password);
	}
}