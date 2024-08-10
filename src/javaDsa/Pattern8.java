package javaDsa;

import java.util.Scanner;

public class Pattern8 {
    //n=5               i      j
	//1 2 3 4 5         1     1-n      
	//1 2 3 4           2     1-(n-1)  
	//1 2 3             3     1-(n-2)
	//1 2               4     1-(n-3)
	//1                 5     1-(n-4)
	
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row value: ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i+1 ;j++) {
				if(j<10) {
					System.out.print("0"+j+" ");
				}else {
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
		
	}
}
