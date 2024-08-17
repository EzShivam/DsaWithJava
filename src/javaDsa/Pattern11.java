package javaDsa;

public class Pattern11 {

//    *    
//	 ***
//	*****
// *******
//*********	
	
	public static void main(String... args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			//for spaces at left side
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			//for star
			int star=0;
			while(star<10) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
				star++;
			}
			}
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
