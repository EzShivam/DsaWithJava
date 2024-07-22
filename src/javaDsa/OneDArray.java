package javaDsa;

import java.util.Scanner;

public class OneDArray {
	
	public static void main(String...args) {
		
		int[] a=new int[5];
		Scanner sc = new Scanner(System.in);

		//for each loop
		for (int i:a) {
			i=sc.nextInt();
			System.out.println(i+",");
		}
	}

}
