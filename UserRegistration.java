package regex.regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = scan.nextLine();
		System.out.println("Enter the last name : ");
		String lastName = scan.nextLine();
		System.out.println("Enter the last name : ");
		String email = scan.nextLine();
		System.out.println("Enter the mobile number : ");
		String mob = scan.nextLine();
		
		System.out.println("Is User First name valid? : "+validateFirstName(firstName));
		System.out.println("Is user Last name valid? : "+validateLastName(lastName));
		System.out.println("Is user email valid? : "+validateEmail(email));
		System.out.println("Is user mobile number valid? : "+validateMobile(mob));
		
		
	}

	private static boolean validateMobile(String mob) {
		
		return Pattern.matches("^([0-9]{0,1})\s([6-9]{1}[0-9]{9})$", mob);
	}

	private static boolean validateEmail(String email) {
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$", email);

	}

	private static boolean validateLastName(String lastName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", lastName);
	}

	private static boolean validateFirstName(String firstName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", firstName);
		
		
	}

}
