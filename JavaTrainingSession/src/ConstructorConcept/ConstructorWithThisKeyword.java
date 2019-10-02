package ConstructorConcept;

public class ConstructorWithThisKeyword {
	
	//global variables
	String name1;
	int age1;
	String dept;
	
	ConstructorWithThisKeyword(String name, int age, String dept) {
		
		//whenever you want to initialize the global variable with the current value of constructor you have to use this keyword in that case
		//if the name of global var and local var is same, in that case you have to use this keyword
		
		name1 = name;	//this.global variable(name and age) = local variable
		age1 = age;
		this.dept = dept;
		
		System.out.println(name1);
		System.out.println(age1);
		System.out.println(dept);
		
		//now global variable(name) = Ajay
		//now global variable(age) = 25
		
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Ajay",25,"QA");

	}

}
