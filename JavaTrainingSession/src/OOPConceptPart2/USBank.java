package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method declaration
	//no method body - only method prototype
	//in Interface we can declare the variables , and variables are by default static in nature
	//variables in Interface are Final/constant in nature - variables value will not be changed - we cannot change the value of variables
	//no static methods in Interface - we cannot create static methods in Interface
	//no main method in interface
	//Interface is abstract in nature - we cannot create object of Interface

}
