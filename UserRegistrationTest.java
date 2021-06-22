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
          String fname = valid.validateFirstName("Shweta");
          Assert.assertEquals("HAPPY", fname);
      }

	  @Test					//test case to fail the firstname validation
      public void checkFirstNameToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          String fname = valid.validateFirstName("shWkn");
          Assert.assertEquals("SAD", fname);
      }
      
	  @Test					//test case to pass to lastname validation
	  public void checkLastNameToValidate() {
		  UserRegistration valid = new UserRegistration();
          String lastName = valid.validateLastName("Pawar");
          Assert.assertEquals("HAPPY",lastName);
	  }
	  
	  @Test					//test case to fail the last name validation
	  public void checkLastNameToSeeInvalid() {
		  UserRegistration valid = new UserRegistration();
         String lastName = valid.validateLastName("pawar");
          Assert.assertEquals("SAD",lastName);
	  }

	  @Test					//test case to pass email validation
      public void checkEmailToValidate(){
          UserRegistration valid = new UserRegistration();
          String mail = valid.validateEmail("shweta.p@yahoo.com");
          Assert.assertEquals("HAPPY",mail);
      }

	  @Test					//test case to fail email validation
      public void checkEmailToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          String mail = valid.validateEmail("shwe@.@yahoo.com");
          Assert.assertEquals("SAD",mail);
      }
	  @Test					//test case to pass mobile number validation
      public void checkMobilToValidate(){
          UserRegistration valid = new UserRegistration();
          String mob = valid.validateMobile("91 9736382937");
          Assert.assertEquals("HAPPY",mob);
      }
	  
	  @Test					//Test case to fail mobile number validation
      public void checkMobilToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
          String mob = valid.validateMobile("91 00736382937");
          Assert.assertEquals("SAD",mob);
      }
	  @Test					// test case to pass Password validation
      public void checkPasswordToValidate(){
          UserRegistration valid = new UserRegistration();
          String password = valid.validatePassword("Purva1!aa");
          Assert.assertEquals("HAPPY",password);
      }
	  
	  @Test					// test case to fail Password validation
      public void checkPasswordToSeeInvalid(){
          UserRegistration valid = new UserRegistration();
         String password = valid.validatePassword("Purc1,");
          Assert.assertEquals("SAD",password);
      }
}
