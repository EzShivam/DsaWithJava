package javaDsa;

import java.util.Scanner;

public class DecimalToBinaryAndBinaryToDecimal {

	static String decimalToBinary(int n) {
		
		//declaring an empty string which store the ultimate binary no.
		String binary = "";
		
		while (n>=1) {
			int rem = n%2;
			n= n/2;
			//we have to concat the string in reverse order, so 
			binary = rem + binary;
		}
		return binary;
	}
	
	static int binaryToDecimal(String binary) {
		//res is variable which ultimately will be our final 
		//decimal number.
		int res = 0; 
		//to add the power of 2 to the binary according to position.
		int powOf2 = 1;
		
		//looping from the last index of the binary number.
		for (int i=binary.length()-1; i>=0; i--) {
			//if the binary positional equivalent is 1 then 
			//only we have to add it to res.
			if(binary.charAt(i)=='1') {
				res = res + powOf2;
			}
			//the powOf2 should be increased always irrespective
			//of the 1 or 0
			powOf2 = powOf2 * 2;
		}
		return res;
	}
	
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		String b = decimalToBinary(decimal);
		System.out.println(b);
		System.out.println(binaryToDecimal(b));
		}
}
