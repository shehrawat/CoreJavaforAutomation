package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		//dynamic array - ArrayList
		//1.can contain duplicate values
		//2.maintains insertion order
		//3.It is not synchronized so it is ArrayList is slow as compared to other collection
		//4.it allows random access to fetch the element because it stores the values on the basis of indexes
		//5.
		
		
		ArrayList ar = new ArrayList();	// here yellow line is visible because of missing the generics
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(300);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));	//to get the value from an index
		
		ar.add("Ajay");
		ar.add("Singh");
		ar.add(12.25);
		ar.add('A');
		
		System.out.println(ar.size());	//size = index+1
		
		//print all the value of ArrayList:
		//1.for loop
		//2.using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic:
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();	//<Integer> this concept is generics in java
		ar1.add(100);
		ar1.add(200);
		//ar1.add("Ajay"); - you can not add other values than integer in this ArrayList
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		ar2.add("World");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//how to store the specific user defined class object in the particular arraylist
		//Employee class object:
		Employee e1 = new Employee("Ajay", 25, "QA");
		Employee e2 = new Employee("Rahul", 24, "BA");
		Employee e3 = new Employee("Bhavy", 23, "PM");
		
		//create ArrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values: use while loop
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//In generics we can define all the premitive data types, non premitive data types and some class object also like Employee
		
		System.out.println("******************************");
		
		//addAll
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Hello");
		ar5.add("World");
		ar5.add("Selenium");
		ar5.add("Apium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Cucumber");
		ar6.add("QTP");
		ar6.add("Apium");
		
		ar5.addAll(ar6);	// addAll method use to merge 2 ArrayList together
		
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		System.out.println("****************");
		
		//removeAll
		
		ar5.removeAll(ar6);
		
		for(int k=0;k<ar5.size();k++) {
			System.out.println(ar5.get(k));
		}
		
		System.out.println("****************");
		
		//retainAll: means common values between 2 arraylist
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Hello");
		ar7.add("World");
		ar7.add("Selenium");
		ar7.add("Apium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Cucumber");
		ar8.add("QTP");
		ar8.add("Apium");
		
		ar7.retainAll(ar8);
		
		for(int k=0;k<ar7.size();k++) {
			System.out.println(ar7.get(k));
		}
	}

}
