package JavaBasics;

public class IncDecOperator {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;	// post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a = 1;
		int b = ++a;	// pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		int m = 2;
		int n = m--;	// post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		int x = 2;
		int y = --x;	// pre decrement
		
		System.out.println(x);
		System.out.println(y);
	}

}
