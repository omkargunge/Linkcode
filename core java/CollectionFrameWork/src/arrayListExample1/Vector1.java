package arrayListExample1;
import java.util.Vector;  

public class Vector1{

			public static void main(String[] args) {
	        Vector obj = new Vector();

	        obj.add(10);
	        obj.add(20);
	        obj.add("hello");
	        obj.add(true);
	        obj.add(1, 99);

	        Vector obj1 = new Vector();
	        obj1.add("omkar");
	        obj1.add("ram");

	        obj.add(obj1);
	        obj.addAll(obj1);

	        System.out.println(obj);
	        System.out.println(obj1);
	        System.out.println(obj.size());

	        System.out.println(obj.get(2));
	        System.out.println(obj.isEmpty());
	        System.out.println(obj.contains(10));
	        System.out.println(obj.firstElement());
	        System.out.println(obj.lastElement());
	        System.out.println(obj.indexOf("hello"));

	        System.out.println(obj.remove(1));


	    }
}
	

