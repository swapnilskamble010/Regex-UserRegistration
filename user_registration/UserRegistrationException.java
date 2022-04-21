package regex.user_registration;

public class UserRegistrationException extends Exception {
	public ExceptionType type;
	public enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME,INVALID_EMAIL, INVALID_MOBILE, INVALID_PASSWORD,
	}

	public UserRegistrationException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
