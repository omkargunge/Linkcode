package exceptionTypesExample;

public class classcastexception {



		public static void main(String[] args) {

			System.out.println("main start");

			try {
				Object obj = "Hello";
				Integer a = (Integer)obj;
			}
			catch(ClassCastException arr) {
				System.out.println(1);
			}
			catch(Exception arr) {
				System.out.println(2);
			}
		}
	}

