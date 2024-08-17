package javaDsa;

public class Pattern15 {

	//        * * * * *  i=1 stars=5(n) spaces=4(n-i)
	//      * * * * *    i=2 stars=5    spaces=3
	//    * * * * *      i=3 stars=5    spaces=2
	//  * * * * *        i=4 stars=5    spaces=1
	//* * * * *          i=5 stars=5    spaces=0
	
	public static void main(String...strings) {
		pattern15(5);
	}
	
	static void pattern15(int row) {
		//outer loop for rows
		for(int i=1; i<=row; i++) {
			//inner loop for spaces
			for(int j=1; j<=row-i; j++) {
				System.out.print("  ");
			}
			//loop for stars
			for(int j=1; j<=row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
