package ConstructorConcept;

public class C {
	
	public void abc() {
		this.xyz();
		System.out.println("abc");
	}
	
	public void xyz() {
		this.pqr();
		System.out.println("xyz");
	}
	
	public void pqr() {
		System.out.println("pqr");
	}

	public static void main(String[] args) {
		C obj = new C();
		obj.abc();

	}

}
