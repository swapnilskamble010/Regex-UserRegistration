package regex.user_registration_test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import regex.user_registration.UserRegistrationException;
import regex.user_registration.ValidateUserRegistration;

@RunWith(Parameterized.class)
public class UserRegistrationParameterisedTest {

	public String testEmail;
	public boolean expectedResult;
	public ValidateUserRegistration userRegistration;

	public UserRegistrationParameterisedTest(String testEmail, boolean expectedResult) {
		this.testEmail = testEmail;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		userRegistration = new ValidateUserRegistration();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][]{
			{"abc@yahoo.com", true}, {"abc-100@yahoo.com", false},	{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
			{"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
			{"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false},
			{"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false},
			{"abc@%*.com", false}, {"abc..2002@gmail.com", false}, {"abc.@gmail.com", true},
			{"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false},
		});
	}

	@Test
	public void testUserRegistrationTest() {
		ValidateUserRegistration userRegistration = new ValidateUserRegistration();
		System.out.println("This is Expected Result " + this.expectedResult);
		try {
			Assert.assertEquals(this.expectedResult, userRegistration.validateEmail(this.testEmail) );
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
}