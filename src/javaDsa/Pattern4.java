package javaDsa;

public class Pattern4 {

	public static void main(String...args) {
		//*
		//* *
		//* * *
		//* * * *
		//row asteric
		// 1   1
		// 2   2
		// 3   3
		// 4   4
		int n = 4;
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
