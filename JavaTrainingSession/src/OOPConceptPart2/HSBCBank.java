package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank {	//here we achieving multiple inheritance
	//Is-a relationship
	
	//if a class implementing any Interface, then it is mandatory to define/override all the methods of Interface
	
	//overriding from USBank Interface
	public void credit() {
		System.out.println("hsbc----credit");
	}
	
	public void debit() {
		System.out.println("hsbc----debit");
	}
	
	public void transfermoney() {
		System.out.println("hsbc----transfermoney");
	}
	
	//separate methods of HSBCBank class
	public void educationloan() {
		System.out.println("hsbc----educationloan");
	}
	
	public void carloan() {
		System.out.println("hsbc----carloan");
	}
	
	//overriding from BrazilBank Interface
	public void mutualfund() {
		System.out.println("hsbc---mutualfund");
	}

}