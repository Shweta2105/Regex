package regex.regularExpressions;

import java.util.regex.Pattern;

public class PincodeValidation {

	public boolean isPincodeValid(String pincode) {
		return Pattern.matches("[0-9]{6}", pincode);
		
	}
	
}
