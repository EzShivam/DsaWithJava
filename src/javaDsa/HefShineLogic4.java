package javaDsa;

import java.util.Scanner;

public class HefShineLogic4 {

	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount == ");
		int amt = sc.nextInt();
		
		//test cases 1.60 Mess 2.600 KFC 3.5000 5star
		
		if(amt < 200 ) {
			System.out.println("Mess");
		}else {
			if(amt < 300) {
				System.out.println("Thali");
			}else {
				if(amt < 500 ) {
					System.out.println("McD");
				}else {
					if(amt < 2000) {
						System.out.println("KFC");
					}else {
						System.out.println("5 star");
					}
				}
			}
		}
	}
}
