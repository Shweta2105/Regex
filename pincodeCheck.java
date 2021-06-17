package regex.regularExpressions;
/*
 * @Author Shweta
 * @param testPincodeValidation method testing valid pincode
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class pincodeCheck {

	@Test
	public void testPincodeValidation() {
		PincodeValidation pin = new PincodeValidation();

		assertTrue(pin.isPincodeValid("400088"));
		assertFalse(pin.isPincodeValid("A400088"));
		assertFalse(pin.isPincodeValid("400088B"));
	}

}
