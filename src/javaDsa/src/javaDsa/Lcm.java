//brute force approach

package javaDsa;

import java.util.Scanner;

public class Lcm {
	
	static int findLcm(int a, int b) {
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a==0 && res%b==0) {
				break;
			}
			res++;
		}
		return res;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("the lcm="+findLcm(a,b));
		
	}

}
