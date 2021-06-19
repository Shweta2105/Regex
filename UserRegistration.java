package regex.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * @authorShweta
 * Day 19 Assignment User registration Problem
 * Refactor for day 20 assignment
 */
public class UserRegistration {
	private final static String NAME_PATTERN = "^[A-Z][a-z]{3,15}$";
	private final static String EMAIL_PATTERN = "^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$";
	private final static String MOBILE_PATTERN = "^\\d{2}[ ]\\d{10}$";
	private final static String PASSWORD_PATTERN = "^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%!][0-9a-zA-Z]*$";
	
	public boolean validatePassword(String password) { //UC8-> UC7-> UC6->UC5 password validation
		/*@param password
		 * @ return boolean
		 */
		
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();
		return result;
	}

	public boolean validateMobile(String mob) {	//UC4 mobile number validation
		/*@param mobile
		 * @ return boolean
		 */
		
		Pattern pattern = Pattern.compile(MOBILE_PATTERN);
		Matcher matcher = pattern.matcher(mob);
		boolean result = matcher.matches();
		return result;
	}

	public boolean validateEmail(String email) {	//UC3 email validation
		/*@param Email
		 * @ return boolean
		 */
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		return result;
	}

	public boolean validateLastName(String lastName) { //UC2 Last name validation
		/*@param Last name
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();
		return result;
	}

	public boolean validateFirstName(String firstName) { //UC1 firstname validation
		
		/*@param first name
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		
		
		return result;
		
		
	}

}
