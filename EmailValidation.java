package regex.regularExpressions;

import java.util.regex.Pattern;

public class EmailValidation {
	
	
	public boolean isEmailValid(String mail) {
		
		return Pattern.matches("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$", mail);

	}

	

}
