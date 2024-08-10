package javaDsa;

import java.util.Scanner;

public class Pattern9 {
	//relation         i        j        number 
	//01               1        1val      1
	//02 03            2        2val      2 3
	//04 05 06         3        3val      4 5 6
	//07 08 09 10      4        4val      7 8 9 10
	//11 12 13 14 15   5        5val
	
	public static void main(String...strings) {
		int number = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row: ");
		int row = sc.nextInt();
		
		//outer for for rows
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(number<10) {
					System.out.print("0"+number+" ");
					number++;
				}else {
					System.out.print(number+" ");
					number++;
				}
			}
			System.out.println();
		}
	}
}
