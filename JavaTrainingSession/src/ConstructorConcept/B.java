package ConstructorConcept;

public class B extends A {
	
	public B() {
		
		super();
		//if you not use super() keyword then default constructor of class A called first then other statement execute
		//and super() keyword should be the 1st statement in constructor.
		//if you write super() below the System.out.println("child class constructor"); , it will give error
		//super keyword should be return in the child class constructor always
		
		System.out.println("child class 0 para const");
		
	}
	
	public B(int i) {
		super(i);
		System.out.println("child class 1 para const");
	}
	
	public B(int i, int j) {
		super(i,j);
		System.out.println("child class 2 para const");
	}
	
	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
	}

}
