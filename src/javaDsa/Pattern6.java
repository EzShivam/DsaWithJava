package javaDsa;

public class Pattern6 {

	//      *  3-spaces 1-star
	//    * *  2-spaces 2-star
	//  * * *  1-spaces 3-star
	//* * * *  0-space  4-star
	public static void main(String...strings) {
		int n=4; //no of rows
		
		//outer for - for next line
		for(int i=1;i<=n;i++) {
			
			//inner for-spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//inner for-star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
				
	}
}
