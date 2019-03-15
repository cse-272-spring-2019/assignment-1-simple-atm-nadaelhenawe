package atm;

import java.util.HashMap;

public class Login {
	
HashMap userDictionary;

public Login() {
	userDictionary=new HashMap();
	userDictionary.put("1234", "9899");
}
	
public boolean validate (String username,String password) {
	boolean validation=false;
	String fetchedPassword=(String)userDictionary.get(username);
	if(fetchedPassword !=null) { 
		validation=fetchedPassword.equals(password);
		
		
	}
	
	return validation;
	
}
}
