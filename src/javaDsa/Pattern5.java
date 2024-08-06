package javaDsa;

public class Pattern5 {

	// * * * *
	// * * *
	// * *
	// *
	//relation
	// row(i) ast(j)
	//  1      4
	//  2      3
	//  3      2
	//  4      1
	
	public static void main(String...strings) {
		int i , j;
		
		for(i=1;i<=4;i++) {
			for(j=4;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
}
