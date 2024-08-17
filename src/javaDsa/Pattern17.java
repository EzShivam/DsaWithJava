package javaDsa;

public class Pattern17 {

	//          1           i=1  4spaces 1
	//        2 1 2         i=2  3spaces 2 to 1
	//      3 2 1 2 3       i=3  2spaces 3 to 1
	//    4 3 2 1 2 3 4     i=4  1space  4 to 1
	//  5 4 3 2 1 2 3 4 5   i=5  0space  5 to 1
	
	public static void main(String...strings) {
		pattern17(5);
	}
	static void pattern17(int row) {
		//loop for rows
		for(int i=1; i<=row; i++) {
			//loop for spaces
			for(int j=1; j<=row-i; j++) {
				System.out.print("  ");//two spaces as we will adding on space later between the numbers.
			}
			//loop for numbers first half
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			//for second half
			for(int j=2; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
