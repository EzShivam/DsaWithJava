package javaDsa;

import java.util.Scanner;

public class EfficientPrimeNumbersUptoN {
    
	static void seivePrimes(int n) {
		boolean[] primes = new boolean[n+1];
		for(int i=2;i*i<=n;i++) {//replacing i<=n to i<=sqrt(n).
			if(primes[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {//replacing j=i*2 to j=i*i
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if (primes[i]==false) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		seivePrimes(p);
	}
}
