package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
		
		System.out.println(x.length); // This is for find the no of rows in array
		System.out.println(x[0].length); // This is for find the no of columns in array
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd row
		x[1][0] = "F";
		x[1][1] = "G";
		x[1][2] = "H";
		x[1][3] = "I";
		x[1][4] = "J";
		
		//3rd row
		x[2][0] = "K";
		x[2][1] = "L";
		x[2][2] = "M";
		x[2][3] = "N";
		x[2][4] = "O";
		
		System.out.println("This is for loop");
		
		for(int i=0;i<x.length;i++) {			// This loop for row
			for(int j=0;j<x[0].length;j++) {	// This loop for column
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("This is for each loop");
		
		for(String i[] : x)
		{
			for(String j : i)
			{
			System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
		
		
		
		
	}

}
