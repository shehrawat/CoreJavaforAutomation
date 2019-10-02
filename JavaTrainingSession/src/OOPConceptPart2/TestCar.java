package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Grandparent - Vechile
		//Parent - Car
		//Child - BMW
		
		//polymorphism - means one to many
		//static polymorphism - compile-time polymorphism
		//compile-time polymorphism - means at the time of compilation java will decide which method i need to call
		BMW b = new BMW();	// BMW is Child Class
		b.start();	//it call start() method of BMW - here 1st preference goes to child class which is BMW
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();	//inherit from my grandparent
		
		System.out.println("*******");
		
		Car c = new Car();	// Car is Parent Class
		c.start();
		c.stop();
		c.refuel();
		//c.theftsafety();	//here you can not access this method because parent cannot acces the child class method
		
		System.out.println("*******");
		
		//Top casting - means dynamic polymorphism
		Car c1 = new BMW();	//child class object can be referred by parent class reference variable - dynamic polymorphism - run time polymorphism
							//here child fit into parent
		c1.start();		//it call start() method of BMW - here 1st preference goes to child class which is BMW
		c1.stop();
		c1.refuel();
		//c.theftsafety();	//here you can not access this method because parent cannot acces the child class method
		
		//Down casting - it is possible but it gives ClassCastException
		BMW b1 = (BMW)new Car();	//here it gives ClassCastException | here parent cannot fit into child
	}

}