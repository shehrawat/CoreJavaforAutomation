package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(1);
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);
		obj.main();
		obj.main(2, 4);
		obj.main(args);
	}
	
	public static void main() {
		System.out.println("This is main method--Zero parameter");
	}
	
	public static void main(int g, int h) {
		System.out.println("This is main method--2 parameters");
	}
	
	
	
	/*You cannot create a method inside a method or 
	duplicate methods - same method name with same number of arguments or input parameters within the same class*/
	//Can we overload main method - YES

	//Method Overloading - When the method name is same with different arguments or input parameters within the same class
	public void sum() {
		System.out.println("Sum method--Zero parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum method--1 input parameter");
	}
	
	public void sum(double i) {
		System.out.println("Sum method--1 input parameter");
	}
	
	public void sum(int k, int l) {
		System.out.println("Sum method--2 input parameter");
		System.out.println(k+l);
	}
	
	public void sum(int k, int l, int m) {
		System.out.println("Sum method--3 input parameter");
	}
	
	public void sum(int k, int l, int m, int n) {
		System.out.println("Sum method--4 input parameter");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
