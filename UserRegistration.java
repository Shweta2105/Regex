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
		System.out.println("Is User First name valid? : "+validateFirstName(firstName));
		System.out.println("Is user Last name valid? : "+validateLastName(lastName));
		
	}

	private static boolean validateLastName(String lastName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", lastName);
	}

	private static boolean validateFirstName(String firstName) {
		return Pattern.matches("^[A-Z][a-z]{3,15}$", firstName);
		
		
	}

}
