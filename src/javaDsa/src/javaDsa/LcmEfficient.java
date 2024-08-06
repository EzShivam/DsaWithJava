//more efficient way to calculate lcm is using the
//euclids algorithm.
package javaDsa;

import java.util.Scanner;

public class LcmEfficient {
	
	static int Lcm(int a, int b) {
		return (a*b)/euclidsHCF(a,b);//the formula given by euclid is lcm(a,b)*hcf(a,b)=a*b
	}
	
	static int euclidsHCF(int a, int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}
		if(a!=0) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("The HCF = "+euclidsHCF(x,y));
		System.out.println("The LCM = "+Lcm(x,y));
	}

}
