package javaDsa;

import java.util.Scanner;

public class FactorsOfGivenNumber {
	
	static void findFactors(int n) {
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		 
		int n;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		findFactors(n);

	}

}
