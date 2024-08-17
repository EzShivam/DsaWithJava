package javaDsa;

public class Pattern14 {

	//*      *
	//**    **
	//***  ***
	//********
	//********
	//***  ***
	//**    **
	//*      *
	public static void main(String...strings) {
		pattern14(5);
	}
	
	static void pattern14(int row) {
			//original pattern
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
			//flip pattern
			for(int i=row;i>=1;i--) {
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
