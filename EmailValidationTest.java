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
	assertTrue(email.isEmailValid("abc.100@yahoo.com"));
	assertTrue(email.isEmailValid("abc112@gmail.net"));
	assertTrue(email.isEmailValid("abc@1.com.au"));
	assertFalse(email.isEmailValid("abc()*@bridgelabz.co"));
	assertFalse(email.isEmailValid("abc@abc@gmail.co"));
	assertFalse(email.isEmailValid("#abcd.def92@3452.abcd"));
	assertFalse(email.isEmailValid("ab$c92@.yahoo.com.ina"));
	assertFalse(email.isEmailValid("abc*xyz@bridgelabz.co.in"));
		
	
	}
}
