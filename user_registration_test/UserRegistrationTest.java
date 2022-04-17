package regex.user_registration_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import regex.user_registration.UserRegistrationMain;

class UserRegistrationTest {
	UserRegistrationMain userRegistration  = new UserRegistrationMain();
	
	@Test
	void givenFirstName_whenProper_shouldReturnTrue() {
		boolean result = userRegistration.validateFirstName("Mahesh");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenFirstName_whenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("mahesh");
		Assert.assertFalse(result);
	}

	@Test
	void givenLastName_whenProper_shouldReturnTrue() {
		boolean result = userRegistration.validateLastName("Yadav");
		Assert.assertTrue(result);
	}

	@Test
	void givenLastName_whenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.validateLastName("yadav");
		Assert.assertFalse(result);
	}

	@Test
	void givenEmail_whenProper_shouldReturnTrue() {
		boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenEmail_whenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.validateEmail("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenMobileNumber_whenProper_shouldReturnTrue() {
		boolean result = userRegistration.validateMobileNumber("91 8411839433");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenMobileNumber_whenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.validateMobileNumber("918411839433");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenPassword_whenProper_shouldReturnTrue() {
		boolean result = userRegistration.validatePassword("Swap@3669");
		Assert.assertTrue(result);
	}

	@Test
	void givenPassword_whenNotProper_shouldReturnFalse() {
		boolean result = userRegistration.validatePassword("test");
		Assert.assertFalse(result);
	}
}
