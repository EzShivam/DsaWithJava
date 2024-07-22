//program to find the gcd or hcf of the no.by using euclids algorithm

package javaDsa;

import java.util.Scanner;

public class gcdHcf {
	    static int calGcd(int a, int b) {
	    	while(a!=b) {
	    		if(a>b) {
	        		  a=a-b;
	        	}else {
	        		  b=b-a;
	        	}
	    	}
	    	return a;
	    }
	      
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	  
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	  
	    	System.out.println("The GCD of two numbers is="+calGcd(a,b));
	    }
}


