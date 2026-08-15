//package arrayListExample1;
//
//import java.util.ArrayList;
//
//public class ArrayListEx {
//	
//	public static void main(String[] args) {
//		
//		ArrayList obj= new ArrayList();
//		obj.add(10);
//		obj.add(20);
//		obj.add("hello");
//		obj.add(true);
//		obj.add(1,99);
//		
//		
//		ArrayList obj1=new ArrayList();
//		obj1.add("omkar");
//		obj1.add("ram");
//		
//		obj.add(obj1);
//		obj.addAll(obj1);
//		
//		System.out.println(obj);
//		System.out.println(obj1);
//		System.out.println(obj.size());
//		
//		System.out.println(obj.get(2));
//		System.out.println(obj.isEmpty());
//		System.out.println(obj.contains(10));
//		System.out.println(obj.getFirst());
//		System.out.println(obj.getLast());
//		System.out.println(obj.indexOf("hello"));
//		
//		System.out.println(obj.remove(1)); 
//		
//		//1.normal for loop
//		for(int i=0;i<obj.size();i++) {
//			System.out.println(obj.get(i));
//		}
//	// 2.enhance for loop
//		for (Object a:obj) {
//			System.out.println(a);
//		}
//		
//		//3.for each loop
//		obj.forEach(a->System.out.println(a));
//		
//		//4.multiadvance
//		obj.forEach(System.out::println);
//		
//		
//	}
//}
package arrayListExample1;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList obj = new ArrayList();

        obj.add(10);
        obj.add(20);
        obj.add("hello");
        obj.add(true);
        obj.add(1, 99);

        // 1. Normal for loop
        System.out.println("Normal for loop:");
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        // 2. Enhanced for loop
        System.out.println("Enhanced for loop:");
        for (Object a : obj) {
            System.out.println(a);
        }

        // 3. forEach loop using Lambda
        System.out.println("forEach loop:");
        obj.forEach(a -> System.out.println(a));

        // 4. Method Reference
        System.out.println("Method Reference:");
        obj.forEach(System.out::println);
    }
}
