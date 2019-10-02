package FinalConceptPackage;

public class FinallyConcept {
	//finally is a block

	public static void main(String[] args) {
		
//		test1();
//		test2();
		div();
	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception E) {
			System.out.println("inside catch block");
		}
		
		finally {	//whatever the exception is coming it doesn't matter. Finally block will be run always
			System.out.println("inside finally block");
		}
	}
	
	public static void test2() {
		try {
		System.out.println("inside test2");
		}
		finally {
			System.out.println("finally test2");
		}
	}
	
	public static void div() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/0;
			System.out.println(k);
		}
		catch(NullPointerException E) {
			System.out.println(E);
		}
		finally {
			System.out.println("inside finally block of div method");
		}
		
	}

}