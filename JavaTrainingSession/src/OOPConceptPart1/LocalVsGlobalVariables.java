package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//These are Global/Class variables
	String name = "Tom";
	int i = 25;
	
	public static void main(String[] args) {
		//Separate memory will be given to the main method
	
		int i = 10;	//this is local variable of main method
					//this i will be stored in memory of main method
		System.out.println(i);
		
		//If you want to access the global variables then you have to create an object of that particular class
		//In java, all non static things will be given to the particular object like: variables(name), methods(sum)
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.i);
		
		obj.sum();
	}
	
	public void sum() {
		int i = 15;		//this is local variable of sum method
		int j = 20;		//this is local variable of sum method
		System.out.println(i);
		System.out.println(j);
	}

}
