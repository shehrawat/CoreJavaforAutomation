package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		//array: to store similar data types in a array variable
		//lower bound/index is = 0
		//upper bound/index is n-1 (n is the size of array)
		//This is one dimensional array
		
		//Disadvantages of array:
		//1.Size is fixed -- static array - to overcome of this problem, we use collection -- Arraylist , Hashtable - use dynamic array
		//2.Store only similar data types -- to overcome of this problem, we use object array
		
		//1. Integer Array 
		int ar[] = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		
		System.out.println(ar.length);
		System.out.println(ar[2]);
	
	
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("*******");
	
		//2. Double Array
		double d[] = new double[3];
		d[0] = 12.44;
		d[1] = 13.56;
		d[2] = 14.29;
		
		System.out.println(d.length);
		System.out.println(d[2]);
		
		System.out.println("*******");
		
		//3. Boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[0]);
		
		System.out.println("*******");
		
		//4. Character array
		char c[] = new char[4];
		c[0] = 2;
		c[1] = 'A';
		c[2] = 'b';
		c[3] ='$';
		
		System.out.println(c.length);
		System.out.println(c[1]);
		
		System.out.println("*******");
		
		//5. String array
		String s[] = new String[3];
		s[0] = "Ajay";
		s[1] = "Shehrawat";
		s[2] = "Hello World";
		
		System.out.println(s[2]);
		
		System.out.println("*******");
		
		//6. Object array - Object is the super class of all the classes in java - It is used to store different types of data types
		Object o[] = new Object[5];
		o[0] = 1;
		o[1] = "Ajay";
		o[2] = 'M';
		o[3] = 65.50;
		o[4] = "26/09/1992";
		
		for(int j=0;j<o.length;j++) {
			System.out.println(o[j]);
		}
		
		
		
		
		
		
		
	}

}
