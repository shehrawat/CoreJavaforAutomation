package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//data conversion:From String to integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Wrapper classes - Integer, Double, Boolean
		
		String y = "12.25";
		
		//String to Double conversion
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		String z = "true";
		
		//String to boolean conversion
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//int to String conversion
		int p = 10;
		
		String s = String.valueOf(p);
		System.out.println(s+20);
		
		String u = "100A";
		int o = Integer.parseInt(u);//Number format exception will occur on this line - For input String "100A"

		
		
	}

}
