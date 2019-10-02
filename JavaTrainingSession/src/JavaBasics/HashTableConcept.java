package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		h.put(3, "Ajay");
		h.put(1, 10);
		h.put(2, 20);
		
		System.out.println("Size of Hashtable : "+h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("A"));
		
		System.out.println(h.toString());	//print all the values of Hashtable
		
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		h1.put(2, 200);
				
		Hashtable<Integer,String> h2 = new Hashtable();
		h2.put(3, "Ajay");
		h2.put(2, "Singh");
		h2.put(1, "Shehrawat");
		
		Hashtable<Integer,String> h3 = new Hashtable();
		
		h3 = (Hashtable<Integer,String>)h2.clone();
		
		System.out.println("Values in clone: "+h3);
		
		h2.clear();
		
		System.out.println("After clearing: "+h2);
	}

}
