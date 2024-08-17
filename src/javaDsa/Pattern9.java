package javaDsa;

public class Pattern9 {

	//1            if we arrange this pattern in a matrix then we can 
	//0 1          see that if we add the cell numbers(i+j) and if the sum of
	//1 0 1        cell number is even then the output is 1 else 0.
	//0 1 0 1 
	//1 0 1 0 1

	public static void main(String...strings) {
		pattern9(5);
	}
	
	static void pattern9(int row) {
		//outer loop for rows
		for(int i=1;i<=row;i++) {
			//inner loop for cols
			for(int j=1;j<=i;j++) {
				//for even
				if((i+j)%2==0) {
				System.out.print(1+" ");
				}
				//for odd
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
	
}
