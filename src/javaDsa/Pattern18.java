package javaDsa;

public class Pattern18 {

	//         *      to solve this problem we have divide the pattern into
	//        ***     two halfs one is top and another is bottom and then 
	//       *****    further divide the top into two one is left-top and 
	//      *******   another is right top
	//      *******
	//       *****
	//        ***
	//         *
	
	public static void main(String...strings) {
		pattern18(4);
	}
	static void pattern18(int row) {
		//loop for rows
		for(int i=1;i<=row;i++) {
			//loop for spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			//loop for stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for stars 
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//flipping the triangle
		for(int i=row;i>=1;i--) {
			//loop for spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			//loop for stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for stars 
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
