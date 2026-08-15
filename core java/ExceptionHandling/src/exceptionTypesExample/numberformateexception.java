package exceptionTypesExample;

public class numberformateexception {


		public static void main(String[] args) {

			System.out.println("main start");

			try {
				String str = "abc";
				int a = Integer.parseInt(str);
			}
			catch(NumberFormatException arr) {
				System.out.println(1);
			}
			catch(Exception arr) {
				System.out.println(2);
			}
		}
	}

