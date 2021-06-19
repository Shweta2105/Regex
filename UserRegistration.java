package regex.regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;
/*
 * @authorShweta
 * Day 19 Assignment User registration Problem
 */
public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = scan.nextLine();
		System.out.println("Enter the last name : ");
		String lastName = scan.nextLine();
		System.out.println("Enter the email id : ");
		String email = scan.nextLine();
		System.out.println("Enter the mobile number : ");
		String mob = scan.nextLine();
		System.out.println("Enter the password : ");
		String password = scan.nextLine();
		
		System.out.println("Is User First name valid? : "+validateFirstName(firstName));
		System.out.println("Is user Last name valid? : "+validateLastName(lastName));
		System.out.println("Is user email valid? : "+validateEmail(email));
		System.out.println("Is user mobile number valid? : "+validateMobile(mob));
		System.out.println("Is user password valid? : "+validatePassword(password));
		
		
	}

	private static boolean validatePassword(String password) { //UC8-> UC7-> UC6->UC5 password validation
		/*@param password
		 * @ return boolean
		 */
		
		return Pattern.matches("^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$", password);
	}

	private static boolean validateMobile(String mob) {	//UC4 mobile number validation
		/*@param mobile
		 * @ return boolean
		 */
		
		return Pattern.matches("^\\d{2}[ ]\\d{10}$", mob);
	}

	private static boolean validateEmail(String email) {	//UC3 email validation
		/*@param Email
		 * @ return boolean
		 */
		
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$", email);

	}

	private static boolean validateLastName(String lastName) { //UC2 Last name validation
		/*@param Last name
		 * @ return boolean
		 */
		
		return Pattern.matches("^[A-Z][a-z]{3,15}$", lastName);
	}

	private static boolean validateFirstName(String firstName) { //UC1 firstname validation
		
		/*@param first name
		 * @ return boolean
		 */
		
		return Pattern.matches("^[A-Z][a-z]{3,15}$", firstName);
		
		
	}

}
