package regex.regularExpressions;
/*
 * @Author Shweta
 * @param emailCheck method testing valid email
 */

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTest {
	@Test
	public void emailCheck() {
	EmailValidation email = new EmailValidation();
	
	assertTrue(email.isEmailValid("abc.xyz@bridgelabz.co"));
	
	}
}
