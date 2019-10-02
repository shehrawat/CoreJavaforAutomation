package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		// Comparison operator 
		// < > <= >= == !=
		
		int a = 30;
		int b = 20;
		int e = 50;
		
		int c = 40;
		int d = 40;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		if(c==d) {
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to d");
		}
		
		if(c!=d) {
			System.out.println("c and d are not equal");
		}
		else {
			System.out.println("c and d are equal");
		}
		
		// nested if-else
		
		if(a>b & a>e) {	// F and F = F | T and T = T | F and T = F
			System.out.println("a is the greatest");
		}
		else if(b>e) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}

	}

}
