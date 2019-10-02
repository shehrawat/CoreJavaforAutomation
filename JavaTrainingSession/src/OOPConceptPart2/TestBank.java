package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println("Min Balance required is : "+USBank.min_bal);
		//USBank.min_bal = 200; - here we cannot change the value because min_bal is Final/constant in nature. It cannot be changed
		
		//static polymorphism
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		System.out.println("*****");
		
		//dynamic polymorphism
		//child class object can be referred by parent Interface reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		
	}

}
