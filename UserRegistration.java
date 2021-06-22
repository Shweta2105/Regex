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
	
	public String validatePassword(String password) { //UC8-> UC7-> UC6->UC5 password validation
		/*@param password
		 * @ return boolean
		 */
		if(password.matches(PASSWORD_PATTERN) == true) {
			return "HAPPY"; }
		else {								//UC10 return HAppy if matches
			return "SAD";
		
		}
		
	}

	public String validateMobile(String mob) {	//UC4 mobile number validation
		/*@param mobile
		 * @ return boolean
		 */
		if(mob.matches(MOBILE_PATTERN) == true) {
			return "HAPPY"; }
		else {
			return "SAD" ;
		
		}
		
	}

	public String validateEmail(String email) {	//UC3 email validation
		/*@param Email
		 * @ return boolean
		 */
		
		if(email.matches(EMAIL_PATTERN) == true) {
			return "HAPPY"; }
		else {
			return "SAD";
		
		}
	}

	public String validateLastName(String lastName) { //UC2 Last name validation
		/*@param Last name
		 * @ return boolean
		 */
		if(lastName.matches(NAME_PATTERN) == true) {
			return "HAPPY" ; }
		else {
			return "SAD" ;
		
		}
	}

	public String validateFirstName(String firstName) { //UC1 firstname validation
		
		/*@param first name
		 * @ return boolean
		 */
		if(firstName.matches(NAME_PATTERN) == true) {
			return "HAPPY"; }
		else {
			return "SAD" ;
		
		}
		
		
	}

}
