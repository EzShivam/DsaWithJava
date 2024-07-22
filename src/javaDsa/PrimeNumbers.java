package javaDsa;

import java.util.Scanner;

public class PrimeNumbers {

	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		System.out.println("is the given number prime = "+isPrime(n));
		}
}

//remember the time complexity of this approach is O(n).
//linear time complexity which is considered as not so efficient.
