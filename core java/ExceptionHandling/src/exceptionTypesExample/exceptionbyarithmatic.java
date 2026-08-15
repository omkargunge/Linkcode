package exceptionTypesExample;

public class exceptionbyarithmatic {

	public static void main(String[] args) {
		
		System.out.println("main start");
		try {
			int a=10/0; //Exception arr=new Arithmatic();
		}catch(NullPointerException arr) {
			System.out.println(1);
		}catch(Exception arr) {
			System.out.println(2);
		}
	}
}
