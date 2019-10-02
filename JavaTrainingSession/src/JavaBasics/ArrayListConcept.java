package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();	//here you can add any value
		al.add(100); //0
		al.add(200); //1
		al.add(300); //2
		al.add(12.25); //3
		al.add('A'); //4
		al.add("Ajay"); //5
		al.add("Singh"); //6
		
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al.size());
		
		System.out.println(al.get(4));
		
		//System.out.println(al.get(7)); - IndexOutOfBoundsException
		
		//print all the values of ArrayList: for loop
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList<Integer> al1 = new ArrayList();
		al1.add(10);
		//al1.add("A"); - you cannot other value except integer
		
		ArrayList<String> al2 = new ArrayList();
		al2.add("Ajay");
		//al2.add(10); - you cannot other value except String
		
	}

}