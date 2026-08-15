package hashSetExample;

import java.util.HashSet;
import java.util.Vector;

public class HastSetSupportMethods {

	
	static HashSet<String>  set=new HashSet<String>();
	public static void main(String[] args) {
		 HashSet obj = new HashSet();
		
		    obj.add(10);
	        obj.add(20);
	        obj.add("hello");
	        obj.add(true);
	        
	        HashSet obj1 = new HashSet();
	        obj1.add("omkar");
	        obj1.add("ram");

	        obj.add(obj1);
	        obj.addAll(obj1);

	        System.out.println(obj);
	        System.out.println(obj1);
	        System.out.println(obj.size());
	        System.out.println(obj.isEmpty());
	        System.out.println(obj.contains(10));
	        System.out.println(obj.remove(1));
	        
	     
		// 2.enhance for loop
			for (Object a:obj) {
				System.out.println(a);
			}
			
			//3.for each loop
			obj.forEach(a->System.out.println(a));
			
			//4.multiadvance
			obj.forEach(System.out::println);
}
}
