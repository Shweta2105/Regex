package regex.regularExpressions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	
	String mail;
	boolean result;
	
	
	
	public EmailParameterizedTest(String mail, boolean result) {
		
		this.mail = mail;
		this.result = result;
	}
	
	@Parameterized.Parameters
	public static List inputFirst() {
		List list = new ArrayList();
    	list.add(new Object[]{"abc@yahoo.com",true});
    	list.add(new Object[]{"abc-100@yahoo.com",false});
    	list.add(new Object[]{"abc.100@yahoo.com",true});
    	list.add(new Object[]{"abc111@abc.com",true});
    	list.add(new Object[]{"abc-100@abc.net",false});
    	list.add(new Object[]{"abc.100@abc.com.au",true});
    	list.add(new Object[]{"abc@1.com",true});
    	list.add(new Object[]{"abc@gmail.com.com",true});
    	list.add(new Object[]{"abc+100@gmail.com",false});
    	list.add(new Object[]{"abc",false});
    	list.add(new Object[]{" abc@.com.my ",false});
    	list.add(new Object[]{"abc123@gmail.a",false});//
    	list.add(new Object[]{"abc123@.com",true});
    	list.add(new Object[]{"abc123@.com.com",true});
    	list.add(new Object[]{".abc@abc.com ",false});
    	list.add(new Object[]{"abc()*@gmail.com",false});
    	list.add(new Object[]{"abc@%*.com",false});
    	list.add(new Object[]{"abc..2002@gmail.com ",false});
    	list.add(new Object[]{"abc.@gmail.com",true});//
   		list.add(new Object[]{"abc@abc@gmail.com",false});
    	list.add(new Object[]{"abc@gmail.com.1a",false});
    	return list;
		
	}
	
	@Test
   	public void ValidateEmail() {
        	UserRegistration user = new UserRegistration();
        	Assert.assertEquals(this.result,user.validateEmail(this.mail));

}
}