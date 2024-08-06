package javaDsa;

import java.util.Scanner;

public class OneDArray {
	
	public static void main(String...args) {
		
		//declaring and initializing array.
		int[] a=new int[5];
		Scanner sc = new Scanner(System.in);

		//for each loop
		for (int i:a) {
			i=sc.nextInt();
			if (i==a.length) {
			System.out.println(i + ".");	
			}else {
			System.out.println(i+",");
			}
			
		}
		sc.close();//closing the scanner object.
	}

}
