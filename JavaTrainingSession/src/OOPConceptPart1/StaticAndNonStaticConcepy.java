package OOPConceptPart1;

public class StaticAndNonStaticConcepy {

	//These are Global/Class variables - the scope of global variables will be available across all the functions with some conditions
	String name = "Tom";	//non-static global variable
	static int i = 25;		//static global variable
	
	public static void main(String[] args) {
		
		//how to call static method and variables?
		//1.direct call with method name
		//2.call with using class name
		
		/*Static methods and static variables are not a part of object.
		  In java a different common memory allocate to these static methods and variables*/
		//But object having access the common memory allocatoin
		//non static variables and methods are the part of object
		
		StaticAndNonStaticConcepy obj = new StaticAndNonStaticConcepy();
		System.out.println(obj.i);	//Here warning is given because we call static variable using object which is wrong
		System.out.println(i);
		System.out.println(StaticAndNonStaticConcepy.i);
		sum();
		StaticAndNonStaticConcepy.sum();
		obj.sum();	//Here warning is given because we call static method using object which is wrong
		
	}
	
	public void sendmail() {	//non-static method
		System.out.println("send mail method");
	}
	
	public static void sum() {	//static method
		System.out.println("sum method");
	}

}
