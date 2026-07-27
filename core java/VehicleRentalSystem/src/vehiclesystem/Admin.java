package vehiclesystem;

public class Admin {

	
	final private static String username="admin";
	final private static String password="admin@123";
	
	public static boolean authenticate(String name,String pass) {
		if(username.equals(name)&&password.equals(pass))
			return true;
		return false;
	}
}
