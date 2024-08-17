package javaDsa;

public class Pattern8 {
	                         //j
	//01               i=1   1
	//02 03            i=2   2-3
	//04 05 06 		   i=3   4-6 
	//07 08 09 10      i=4   7-10
	//11 12 13 14 15   i=5   11-15
	
	//here we are not printing the values of j but we are printing one
	//number which is starting from 1 and increases with each iteration.
	
	public static void main(String...strings) {
		pattern8(5);
	}
	
	static void pattern8(int row) {
		int n=1;
		//outer for loop for the rows
		for(int i=1; i<=row; i++) {
			//inner for loop for printing the values
			for(int j=1;j<=i;j++) {
				//to attach a 0 in front of single digit numbers.
				if(n<10) {
				System.out.print("0"+n+" ");
				n++;
				}
				else {
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}

}
