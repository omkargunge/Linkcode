package hashSetExample;

import java.util.HashSet;

public class SignUp {
	
	static HashSet<String>  set=new HashSet<String>();
	public static void main(String[] args) {
		
		singup("abc@gmail.com");
		singup("abc@gmail.com");
	}
	private static void singup(String email) {
		
		boolean res= set.add(email);
		if(res) {
			System.out.println("registration completed");
		}else {
			System.out.println("Email already exists");
		}
	}
	
}
