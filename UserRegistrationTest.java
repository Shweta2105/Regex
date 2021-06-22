package regex.regularExpressions;

/*
 * @authorShweta
 * Day 19 Assignment User registration Problem
 * Refactor for day 20 assignment
 */
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test // test case to pass true to firstname validation
	public void checkFirstNameToValidate() throws UserDefinedException {
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateFirstName("Shweta");
		Assert.assertEquals(true, result);
	}

	@Test // test case to fail the firstname validation
	public void checkFirstNameToInvalid() throws UserDefinedException {
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateFirstName("vD");
		Assert.assertEquals(false,result);
	}

	@Test // test case to pass to lastname validation
	public void checkLastNameToValidate() throws UserDefinedException {
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateFirstName("Pawar");
		Assert.assertEquals(true, result);
	}

	@Test // test case to fail the last name validation
	public void checkLastNameToSeeInvalid() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateLastName("pawar");
		Assert.assertEquals(false, result);
	}

	@Test // test case to pass email validation
	public void checkEmailToValidate() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateEmail("shweta.p@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test // test case to fail email validation
	public void checkEmailToSeeInvalid() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateEmail("shwe@.@yahoo.com");
		Assert.assertEquals(false, result);
	}

	@Test // test case to pass mobile number validation
	public void checkMobilToValidate() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateMobile("91 9736382937");
		Assert.assertEquals(true, result);
	}

	@Test // Test case to fail mobile number validation
	public void checkMobilToSeeInvalid() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validateMobile("91 0079836382937");
		Assert.assertEquals(false, result);
	}

	@Test // test case to pass Password validation
	public void checkPasswordToValidate() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validatePassword("Purva1!aa");
		Assert.assertEquals(true, result);
	}

	@Test // test case to fail Password validation
	public void checkPasswordToSeeInvalid() throws UserDefinedException{
		UserRegistration valid = new UserRegistration();
		boolean result = valid.validatePassword("Purc1,");
		Assert.assertEquals(false, result);
	}
}
