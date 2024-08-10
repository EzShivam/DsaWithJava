package javaDsa;

import java.util.Scanner;

public class Pattern7 {
                  //i  //j
	//1          1-row  1-1(i)
	//1 2 		 2-row  1-2(i)
	//1 2 3		 3-row  1-3(i)
	//1 2 3 4    4-row  1-4(i)
	
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int row = sc.nextInt();
		
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
