package javaDsa;

import java.util.Scanner;

public class PrimeNumbersUptoN {
     static void primeNumbers(int n) {
    	 for(int i=2;i<=n;i++) {
    		 if(javaDsa.PrimeNumbers.isPrime(i)) {
    			 System.out.println(i);
    		 }
    	 }
     }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int p = sc.nextInt();
    	 primeNumbers(p);
     }
}

//but this is not the efficient algorithm due to its time complexity is 
//O(n*sqrt(n))
