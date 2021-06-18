package regex.regularExpressions;

import java.util.regex.Pattern;

public class EmailValidation {
	
	
	public boolean isEmailValid(String mail) {
		
		return Pattern.matches("^.([a-zA-Z]{2,3}+)$", mail);

	}

	

}
