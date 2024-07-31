package javaDsa;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static void checkArmstrong(int n) {
		int temp1 = n;
		int countDig = 0;
		while(temp1!= 0) {
			countDig++;
			temp1=temp1/10;
		}
		int temp2 = n;
		int sum = 0;
		while(temp2!=0) {
			int rem = temp2%10;
			int result = 1;
			for(int i=1; i<=countDig; i++) {
				result = result * rem;
			}
			sum = sum + result;
			temp2 = temp2/10;
		}
		if(sum == n) {
			System.out.println(n + " is a armstrong number");
		}else {
			System.out.println(n + " is not a armstrong number");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbet to check = ");
		int n = sc.nextInt();
	    checkArmstrong(n);
	}
}
