package wrapper;

public class wrapperclassboxing {
	
	//package wrapper;
	//
	//public class wrap {
//		public static void main(String[] args) {
//			int a=10; //PM
//			Integer c=a;
//			Integer b=Integer.valueOf(a); //NPM
////			public static Integer valueOf(int a);
//			
//			System.out.println(a+10);//20
//			System.out.println(b.toString()+10);//20
//			System.out.println(c.toString()+10);
//			
//			
//		}
	//}
	

	
	    public static void main(String[] args) {
	    	//primitive datatype ----> wrapper class object
	        
	        // int -> Integer
	        int a = 10;
	        Integer b = a;
	        System.out.println(b);
	        
	        // byte -> Byte
	        byte c = 88;
	        Byte d = c;
	        System.out.println(d);
	        
	        // short -> Short
	        short e = 1110;
	        Short f = e;
	        System.out.println(f);
	        
	        // long -> Long
	        long l = 2346L;
	        Long L = l;
	        System.out.println(L);
	        
	        // double -> Double
	        double D = 0.2;
	        Double dw = D;
	        System.out.println(dw);
	        
	        // float -> Float
	        float f1 = 338.6f;
	        Float flo = f1;
	        System.out.println(flo);
	        
	        // char -> Character
	        char A = 'S';
	        Character ch = A;
	        System.out.println(ch);
	        
	        // boolean -> Boolean
	        boolean b1 = true;
	        Boolean bool = b1;
	        System.out.println(bool);
	    }
	}



