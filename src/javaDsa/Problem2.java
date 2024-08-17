package javaDsa;

public class Problem2 {

	public static void main(String args[]) {
		
		String s = "Program";
		String temp = "";
		int n = s.length(),m,d;
		m=n/2;
		d=m;
		System.out.println(d);
		
		for(int i=m;i<n;i++) {
			temp=temp+s.charAt(i);
			System.out.println(temp);
		}
		
	}
}
