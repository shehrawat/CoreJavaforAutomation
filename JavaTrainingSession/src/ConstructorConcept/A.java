package ConstructorConcept;

public class A {
	
	public A() {
		System.out.println("Parent class constructor");
	}
	
	public A(int i) {
		System.out.println("Parent class constructor with value of i is: "+i);
	}
	
	public A(int i, int j) {
		System.out.println("Parent class constructor with value of i is: "+i);
		System.out.println("Parent class constructor with value of j is: "+j);
		
	}

}