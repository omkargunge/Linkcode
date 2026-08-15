package stringanddatatypes;

public class StringToPrimitive {
	public static void main(String[] args) {
		
		
		// String -> int
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);


		// String -> byte
		String s1 = "10";
		byte b = Byte.parseByte(s1);
		System.out.println(b);


		// String -> short
		String s2 = "200";
		short sh = Short.parseShort(s2);
		System.out.println(sh);


		// String -> long
		String s3 = "123456789";
		long l = Long.parseLong(s3);
		System.out.println(l);


		// String -> float
		String s4 = "12.5";
		float f = Float.parseFloat(s4);
		System.out.println(f);


		// String -> double
		String s5 = "99.9";
		double d = Double.parseDouble(s5);
		System.out.println(d);


		// String -> boolean
		String s6 = "true";
		boolean bl = Boolean.parseBoolean(s6);
		System.out.println(bl);


		// String -> char
		String s7 = "A";
		char ch = s7.charAt(0);
		System.out.println(ch);
	}
}
