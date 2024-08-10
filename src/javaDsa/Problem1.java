package javaDsa;

import java.util.Scanner;

public class Problem1 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a stirng: ");
		String s = sc.next();
		
//		Expected output = "program"
//		      p
//		     pr
//		    pro
//		   prog
//		  progr
//		 progra
//		program
		
		
		
		int row = s.length()-1;
		System.out.println(row);
		
		char[] as = s.toCharArray();
		
		for(int i=0; i<=row;i++) {
			//inner for-spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			//inner for-char
			for(int j=0;j<=i;j++) {
				System.out.print(as[j]+"");
			}
			System.out.println();
		}
		
	}
}
