package javaDsa;

import java.util.Scanner;

public class PalindromeNumber {
	
	/* palindrome number is number when read from both front and reverse
	order gives the same output.
	E.g. 121 
	The concept which is used to check if the given num is palindrome is 
	reversing the given number. */
	
	/* test cases:
	 1.1223 = not a palindrome number.
	 2.1551 = is palindrome number.
	 */
	
	public static void checkPalindrome(int n) {
		int temp = n;
		int rev = 0, rem;
		while(temp!=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			}
		if(n == rev) {
			System.out.println(n +" Is a palindrome number.");
		}else {
			System.out.println(n +" Is not a palindrome number.");
		}
	}
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		checkPalindrome(n);
	}
}

/*Algorithm:
 Step 1- until the number is not equal to 0 store all the digits from the
 backside one by one in one variable called rev
 
 Step 2- now check if the original number is same as the rev and if the
 condition is true the number is palindrome else not palindrome. */
