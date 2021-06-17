package regex.regularExpressions;

import java.util.regex.Pattern;

public class PincodeValidation {

	public boolean isPincodeValid(String pincode) {
		return Pattern.matches("[1-9]{1}[0-9]{2}\\s[0-9]{3}", pincode);
		
	}
	
}
