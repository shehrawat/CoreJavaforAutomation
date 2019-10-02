package ConstructorConcept;

public class ConstructorConcept {
	
	//Constructor: it is a class entity which is used to define class features while creating the object
	/*I you want to define some class features is in the form of global variables, in the form of objects, in that case 
	we have to use constructor*/
	//Constructor name should be as a class name and have no return type
	//there is always a hidden default constructor in every class
	
	public ConstructorConcept() {	//this is default Constructor:means 0 parameter
		System.out.println("this is default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("single parameter Constructor");
		System.out.println("the value of i is: "+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("two parameter Constructor");
		System.out.println("the value of i is: "+i);
		System.out.println("the value of j is: "+j);
		
		//Is constructor can be overloaded: yes
		//this is a constructor overloading
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
	}

}
