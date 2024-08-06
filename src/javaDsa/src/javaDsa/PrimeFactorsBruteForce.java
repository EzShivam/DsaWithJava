package javaDsa;

import java.util.Scanner;

public class PrimeFactorsBruteForce {
  
	static void primeFactors(int n) {
		
		int i = 2;//2 is the first prime no.
		
		while(n>1) {
			while(n%i==0) {
				System.out.println(i);
				n = n/i ;//updating the value of n after dividing by i.
			}
			i++;
		  }
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeFactors(n);
	}
}
