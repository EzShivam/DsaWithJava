package javaDsa;

public class Pattern13 {
	
	//*      *
	//**    **
	//***  ***
	//********
	public static void main(String...strings) {
		pattern13(5);
	}
	
	static void pattern13(int row) {
		//outer loop for rows
		for(int i=1;i<=row;i++) {
			//loop for first half
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//loop for spaces
			for(int j=1;j<=2*(row-i);j++) {//j<=2*row-i*2
				System.out.print(" ");
			}
			//loop for second half
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
