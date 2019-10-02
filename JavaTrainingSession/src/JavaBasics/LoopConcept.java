package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {

		// 1. while loop
		// disadvantage of while loop - it will generate infinite loop if you don't give incremental/decremental part
		
		int i = 1;	// initialization
		while(i<=10) {		// condition part
			System.out.println(i*2);	// statement part
			i=i+1;	//incremental/decremental part
		}
		System.out.println("*******");
		
		// 2. for loop
		for(int j=1;j<=10;j++)	// initialization;condition part;incremental/decremental part
		{
			System.out.println(j);	// statement part
		}
		
		System.out.println("******");
		
		for(int k=10;k>=-10;k--)
		{
			System.out.println(k);
		}
	}

}
