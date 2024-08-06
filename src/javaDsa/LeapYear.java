package javaDsa;

import java.util.Scanner;

public class LeapYear {
	
	//there are two main conditions for the year to be leap year
	//1.year should be divisible by 4
	//2.year should be divisible by 400 but yeat must not be divisible by 100.
	
	public static void checkLeapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+" Is a leap year");
				}else {
					System.out.println(year+" Is not a leap year");
				}
			}else {
				System.out.println(year+" Is a leap year");
			}
		}else {
			System.out.println(year+" Is not a leap year");
		}
	}

	
	public static void main(String...strings) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		checkLeapYear(year);
	}
}
