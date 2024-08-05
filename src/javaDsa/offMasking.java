package javaDsa;

public class offMasking {
 
	public static void main(String...strings) {
		
		//the number 00100100 to decimal
		int n = 36;
		
		//suppose we have to make the 5th bit ON
		int i = 5; 
		
		//in order to make the i th bit we have to first perform the 1<<i th 
		//time and then have to negate the value
		int OnMasking = ~(1<<5);
		
		//now we can perform the AND operation
		int res = n & OnMasking;
		
		System.out.println(res);//4
	}
}
