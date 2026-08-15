package exceptionTypesExample;

public class stringindexoutofbondexception {

	

		public static void main(String[] args) {

			System.out.println("main start");

			try {
				String str = "Hello";
				System.out.println(str.charAt(10));
			}
			catch(StringIndexOutOfBoundsException arr) {
				System.out.println(1);
			}
			catch(Exception arr) {
				System.out.println(2);
			}
		}
	}

