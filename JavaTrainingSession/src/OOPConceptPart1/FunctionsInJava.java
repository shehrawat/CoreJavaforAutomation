package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String m = obj.qa();
		System.out.println(m);
		int n = obj.division(10, 2);
		System.out.println(n);
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	public int division(int x, int y) {
		System.out.println("division method");
		int d=x/y;
		
		return d;
	}

}
