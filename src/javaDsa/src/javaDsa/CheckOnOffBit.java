//code to check if the bit is On or Off.

package javaDsa;

public class CheckOnOffBit {

	public static void main(String...strings) {
		int n = 36;
		int i = 4;
		
		int checkMask = 1<<i;
		
		if((n & checkMask)==0) {
			System.out.println("The bit is OFF");
		}else {
			System.out.println("The bit is ON");
		}
	}
}
