package javaDsa;

import java.util.Scanner;

public class HefShineClass1 {

	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount == ");
		int amt = sc.nextInt();
		
		//test cases 1.50 Mess 2.600 KFC 3.5000 5star
		
		if(amt > 3000) {
		  System.out.println("5 star");
		}else if (amt > 2000) {
			System.out.println("KFC");
		}else if(amt > 500) {
			System.out.println("McD");
		}else if(amt > 200) {
			System.out.println("Thali");
		}else {
			System.out.println("Mess");
		}
	}
}
