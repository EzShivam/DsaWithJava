package javaDsa;

import java.util.Scanner;

public class MuchMoreEfficientPrimeNumbers {
	
	static boolean checkPrime(int n) {
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i=5; i*i<n; i=i+6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		System.out.println("is the given numbers prime? "+checkPrime(p));
	}

}

//the time complexity of this algorithm is also 0(sqrt(n)).
//but as the i value increases every time by 6 this is more efficient.
