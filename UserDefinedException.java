package regex.regularExpressions;

public class UserDefinedException extends Exception {
	
	public String errormsg;

	public UserDefinedException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}
	
}
