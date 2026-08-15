package wrapper;
//
//public class differentDataType {
//	public static void main(String[] args) {
//		char a='a';
//		String A =String.valueOf(a);
//		
//		byte d=10;
//		String D=String.valueOf(d);
//		
//		long b=123456;
//		String B=String.valueOf(b);
//		
//		short c=9586;
//		String C=String.valueOf(c);
//		
//		int f=7894;
//		String F=String.valueOf(f);
//		
//		float u=10.20f;
//		String U=String.valueOf(u);
//		
//		double s=410.222;
//		String S=String.valueOf(s);
//		
//		boolean p=true;
//		String P=String.valueOf(p);
//		
//		
//	}
//}


//String  a="10";
//int A=Integer.parseInt(a);
//
//String  b="10";
//byte B=Integer.parseInt(b);
//
//String  a="10";
//short A=Integer.parseInt(a);
//
//String  a="10";
//is A=Integer.parseInt(a);
//
//String  a="10";
//int A=Integer.parseInt(a);
//
//String  a="10";
//int A=Integer.parseInt(a);
//
//String  a="10";
//int A=Integer.parseInt(a);
//
//String  a="10";
//int A=Integer.parseInt(a);

public class differentDataType {
    public static void main(String[] args) {

        // String -> byte
        String s1 = "10";
        byte b = Byte.parseByte(s1);
        System.out.println("byte = " + b);

        // String -> short
        String s2 = "100";
        short sh = Short.parseShort(s2);
        System.out.println("short = " + sh);

        // String -> int
        String s3 = "500";
        int i = Integer.parseInt(s3);
        System.out.println("int = " + i);

        // String -> long
        String s4 = "123456789";
        long l = Long.parseLong(s4);
        System.out.println("long = " + l);

        // String -> float
        String s5 = "12.5";
        float f = Float.parseFloat(s5);
        System.out.println("float = " + f);

        // String -> double
        String s6 = "99.99";
        double d = Double.parseDouble(s6);
        System.out.println("double = " + d);

        // String -> boolean
        String s7 = "true";
        boolean bool = Boolean.parseBoolean(s7);
        System.out.println("boolean = " + bool);

        // String -> char
        String s8 = "A";
        char ch = s8.charAt(0);
        System.out.println("char = " + ch);
    }
}