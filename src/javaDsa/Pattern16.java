package javaDsa;

public class Pattern16 {

	//      1         i=1 4spaces 1(i times)
	//     2 2        1=2 3spaces 2(i times)
	//    3 3 3       i=3 2spaces 3(i times)
	//   4 4 4 4      i=4 1space  4(i times)
	//  5 5 5 5 5     i=5 0space  5(i times)
	
	public static void main(String...strings) {
		pattern16(5);
	}
	static void pattern16(int row) {
		//loop for rows
		for(int i=1; i<=row; i++) {
			//loop for spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			//for numbers (i printed i times)
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");//adding the space inside the numbers.
			}
			System.out.println();
		}
	}
}
