package javaDsa;

public class OnMask {
	
	public static void main(String...args) {
		
		int n = 36;//the number on which the onMasking should be performed.
		int i = 3;//the ith digit 
		
		int onMask = 1<<i;//1 left shift thrice
		
		int res = n | onMask;//or operation 
		
		System.out.println(res);//44
	}

}
