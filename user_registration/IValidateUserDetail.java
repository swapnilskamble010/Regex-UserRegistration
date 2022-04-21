package regex.user_registration;

@FunctionalInterface
public interface IValidateUserDetail {
	boolean userValidation(String userDetails,String pattern);
}
