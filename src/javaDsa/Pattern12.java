package javaDsa;

public class Pattern12 {

	// 1 2 3 4 5 i=1  j/cols = 1-5
	// 1 2 3 4   i=2         = 1-4
	// 1 2 3     i=3         = 1-3
	// 1 2       i=4         = 1-2
	// 1         i=5         = 1
	
	public static void main(String args[]) {
		pattern12(5);
	}
	
	static void pattern12(int row) {
		//outer for loop for rows
		for(int i=1;i<=row;i++) {
			//inner for loop for printing numbers
			for(int j=1;j<=row+1-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
