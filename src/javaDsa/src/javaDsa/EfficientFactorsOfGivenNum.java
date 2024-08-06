package javaDsa;

import java.util.Scanner;

public class EfficientFactorsOfGivenNum {
	
	//n=25
	static void findFactors(int n) {
		
		//initializing i outside the for so it can be accessed 
		int i = 0;
		for(i=1; i*i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		//not providing the initialization
		for(;i>=1;i--) {
			
			//checking if the i is factor and i is not equal to the n/i
			if(n%i==0 && i != n/i) {
				System.out.println(n/i);
			}
		}
		
	}
	
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int n = sc.nextInt();
		findFactors(n);
		
	}

}


//25 = 1,5,25
//40 = 1,2,4,5,8,10,20,40

//the time complexity of this algorithm is root(n).
