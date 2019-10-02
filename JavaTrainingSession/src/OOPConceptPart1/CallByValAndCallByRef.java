package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		//obj.sumtest(10, 20); -here 10 will be given to a and 20 to b.Means copy of 10 and 20 will be given to a and b not the original value
		obj.sumtest(x, y); //call by value OR pass by value
		
		obj.p  =50;
		obj.q = 60;
		
		obj.swao(obj);
		//after swap
		System.out.println("Value of p is : "+obj.p);
		System.out.println("Value of q is : "+obj.q);
	}
	
	
	public int sumtest(int a, int b) {	// here a = 10 and b = 20
		a = 30;		// if we do not write this line, a = 10
		b = 40;		// if we do not write this line, b = 20
					// and c = 30
		int c = a+b;	//now c = 70
		System.out.println(c);
		return c;
	}	
	
	//call by reference
	public void swao(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;	// temp = 50
		t.p = t.q;	//t.p = 60
		t.q = temp;	//t.q = 50
		
	}

}
