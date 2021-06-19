package regex.regularExpressions;

/*
 * @authorShweta
 * Day 19 Assignment User registration Problem
 * Refactor for day 20 assignment
 */
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	  @Test				//test case to pass true to firstname validation
      public void checkFirstNameToValidate(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateFirstName("Shweta");
          Assert.assertTrue(result);
      }

	  @Test					//test case to fail the firstname validation
      public void checkFirstNameToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateFirstName("shWeta");
          Assert.assertFalse(result);
      }
	  @Test					//test case to pass to lastname validation
	  public void checkLastNameToValidate() {
		  UserRegistration valid = new UserRegistration();
          boolean result = valid.validateLastName("Pawar");
          Assert.assertTrue(result);
	  }
	  
	  @Test					//test case to fail the last name validation
	  public void checkLastNameToSeeInvalid() {
		  UserRegistration valid = new UserRegistration();
          boolean result = valid.validateLastName("pawar");
          Assert.assertFalse(result);
	  }

	  @Test					//test case to pass email validation
      public void checkEmailToValidate(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateEmail("shweta.p@yahoo.com");
          Assert.assertTrue(result);
      }

	  @Test					//test case to fail email validation
      public void checkEmailToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateEmail("shweta.p@@yahpp.cooo");
          Assert.assertFalse(result);
      }
	  @Test					//test case to pass mobile number validation
      public void checkMobilToValidate(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateMobile("91 9736382937");
          Assert.assertTrue(result);
      }
	  
	  @Test					//Test case to fail mobile number validation
      public void checkMobilToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validateMobile("91 00736382937");
          Assert.assertFalse(result);
      }
	  @Test					// test case to pass Password validation
      public void checkPasswordToValidate(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validatePassword("Purva1!aa");
          Assert.assertTrue(result);
      }
	  
	  @Test					// test case to fail Password validation
      public void checkPasswordToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          boolean result = valid.validatePassword("Purc1,");
          Assert.assertFalse(result);
      }
}
