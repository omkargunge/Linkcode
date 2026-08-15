package exceptionTypesExample;

public class nullpointerexception {

	

		public static void main(String[] args) {

			System.out.println("main start");

			try {
				String str = null;
				System.out.println(str.length());
			}
			catch(NullPointerException arr) {
				System.out.println(1);
			}
			catch(Exception arr) {
				System.out.println(2);
			}
		}
	}

