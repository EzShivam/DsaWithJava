package javaDsa;

public class toggleMasking {
	
	public static void main(String...strings) {

	int n = 36;
	
	int i = 4;
	
	int toggleMasking = 1<<i;
	
	int res = n ^ toggleMasking;
	
	System.out.println(res);
	
	
	}
	
	
	
}
