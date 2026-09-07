package customexception2;

import java.util.Scanner;

public class ExceptionPasswordCheck {

	
		public static void main(String[] args) throws InvalidPasswordException {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a password (min 6 characters):");
	        String password = sc.nextLine();

	        validatePassword(password);  

	        System.out.println("Password is valid.");
	        sc.close();
	    }

	    private static void validatePassword(String password) throws InvalidPasswordException {
	        if (password.length() >= 6) {
	            System.out.println("Password length OK: " + password.length());
	        } else {
	            throw new InvalidPasswordException(
	                "Password too short. Minimum 6 characters required."
	            );
	        }
	    }
	}

