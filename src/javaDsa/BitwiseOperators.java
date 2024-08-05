package javaDsa;

public class BitwiseOperators {
	
	public static void main(String args[]) {
		
		//bitwise OR
		System.out.println(5 | 9);//13
		
		//bitwise AND
		System.out.println(5 & 9);//1
		
		//bitwise XOR
		System.out.println(5 ^ 9);//12
		
		//bitwise left shift 
		System.out.println(5<<1);//10   5*2*1
		System.out.println(5<<2);//20   5*2*2
		System.out.println(5<<3);//40   5*2*2*2
		
		//bitwise right shift on positive int values 
		System.out.println(5>>1);//2
		System.out.println(5>>2);//1
		System.out.println(5>>3);//0
		
		//bitwise right shift on negative int values 
		System.out.println(-5>>1);//-3
		System.out.println(-5>>2);//-2
		System.out.println(-5>>3);//-1
		
		
		
		
		
	}

}
