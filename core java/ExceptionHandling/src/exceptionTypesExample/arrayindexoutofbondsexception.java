package exceptionTypesExample;

public class arrayindexoutofbondsexception {


		public static void main(String[] args) {

			System.out.println("main start");

			try {
				int a[] = {10,20,30};
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException arr) {
				System.out.println(1);
			}
			catch(Exception arr) {
				System.out.println(2);
			}
		}
	}

