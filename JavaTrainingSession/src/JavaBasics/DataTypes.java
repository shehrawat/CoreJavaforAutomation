package JavaBasics;

public class DataTypes {
	
	public static void main(String[] args) {
		
		// Comment - Means some documentation, some information about your code
		// Primitive data types - int, char, boolean, double
		/*These are warnings on line number(yellow marks) - it says that this line number code is not in use(means it not executing)
		It says that delete this or execute this.*/
		
		// 1. int
		int i = -1;			// In java memory, local variables are stored in stack memory
		int i1 = 0;			// variable should be unique
		int i2 = 1;
		i2 = 2;				// At this line i2 replace the value of 1 to 2
		System.out.println(i2);
		
		// 2. double - means floating value
		double d = -12.33;
		double d1 = 12.44;
		double d2 = 12;		// It means d2 = 12.00
		double d3 = 0;
		System.out.println(d1);
		
		// 3. char - Only single digit value and it should be written in single quotes
		char c = 1;
		char c1 = 'A';
		char c2 = '$';
		System.out.println(c2);
		
		// 4. boolean - it can have only 2 values - true or false
		boolean b = true;	// true and false are values as well as keywords
		boolean b2 = false;
		System.out.println(b);
		
		// 5. String - String is class not a data type but we can use as data type
		String s = "Ajay";
		System.out.println(s);
	}

}
