package OOPConceptPart2;

public class BMW extends Car {	//means has a relationship
	
	//method overriding - when same method is present in parent class as well as child class with same name and number of arguments
	public void start() {	//this is overridden method
		System.out.println("BMW----start");
	}
	
	public void theftsafety() {
		System.out.println("BMW----theftsafety");
	}

}
