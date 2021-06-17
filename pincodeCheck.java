package regex.regularExpressions;

import static org.junit.Assert.*;

import org.junit.Test;

public class pincodeCheck {
	
	@Test
	public void testPincodeValidation() {
		PincodeValidation pin = new PincodeValidation();
		
		assertTrue(pin.isPincodeValid("400088"));
		
		
	}

}
