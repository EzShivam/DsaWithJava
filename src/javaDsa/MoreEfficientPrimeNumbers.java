package javaDsa;

import java.util.Scanner;

public class MoreEfficientPrimeNumbers {
    
	static boolean isPrime(int n) {
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		System.out.println("is the given number prime = "+isPrime(p));
	}
}

//though this is the more efficient way to find the prime numbers.
//the time complexity of this approach is O(sqrt(n)).
//but there is another more efficient way to find prime numbers.