package map;

import java.util.HashMap;

public class HashMap1 {
	 
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		//add --put
		map.put("geeta", 89);
		map.put("ram",99);
		map.put("rohan",79);
		map.put("rohan",99);
		map.put(null, 77);
		map.put("shyam",null);
		//map.put(true,false);
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		map.entrySet().forEach(val->System.out.println(val));
	}
}
