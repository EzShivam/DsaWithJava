package javaDsa;

import java.util.Scanner;

public class EfficientPrimeFactors {
	
	static void primeFactorsEffective(int n) {
		int i = 2;
		while(i*i<=n) {//checking if the factors are found in the range i<=sqrt(n).
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		if(n>1) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		primeFactorsEffective(p);
		}
}

//this is more effective algorithm to calculate the prime factors as the 
//time complexity of this is O(sqrt(n)log n)
