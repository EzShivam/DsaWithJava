package javaDsa;

public class Pattern10 {

	//*        * 8space 2*(5-1)
	//**      ** 6space 2*(5-2)
	//***    *** 4space 2*(5-3)
	//****  **** 2space 2*(5-4)
	//********** 0space 2*(5-5)
	
	
	public static void main(String...strings) {
		 int row = 5;
		 
		 for(int i=1;i<=row;i++) {
			 //for first triangle
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 //for spaces 
			 int space = 2*(row-i);
			 for(int j= 1;j<=space;j++) {
				 System.out.print(" ");
			 }
			 //for left triangle
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
}