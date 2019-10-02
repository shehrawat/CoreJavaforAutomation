package OOPConceptPart1;

public class Car {
	
	//Class variables/Global variables:
	int model;
	int wheel;

	public static void main(String[] args) {
		Car a = new Car();	//new Car() - This is object of Car class - An object will be created in Heap memory
							// new keyword is used to create an object
							//a,b,c are an object reference variable

		/*Means my body is an object and Ajay representing my body means Ajay is an object reference variable*/
		
		Car b = new Car();
		Car c = new Car();
		
		/*copy of int mod and int wheel will be given to all object. Java creates the many copies of these variables*/
		
		a.model = 2015;
		a.wheel = 4;
		
		b.model = 2016;
		b.wheel = 4;
		
		c.model = 2017;
		c.wheel = 4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the reference");
		a=b;
		b=c;
		c=a;
		
		a.model = 10;
		System.out.println(a.model);
		c.model = 20;
		System.out.println(a.model);
		System.out.println(c.model);
	}

}
