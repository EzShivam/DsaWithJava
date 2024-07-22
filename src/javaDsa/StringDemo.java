package javaDsa;

public class StringDemo {

	public static void main(String...args) {
		String s = "Hello";
		String v = "And Welcome";
				
		String n = s.concat(" "+v);
		
		System.out.println(n);//Hello and Welcome
		System.out.println(s);//Hello (since strings are immutable therefore the original string is not changed. )
		
		StringBuffer p = new StringBuffer("Hello");
		StringBuffer q = new StringBuffer("and welcome");
		
		StringBuffer r = p.append(" "+q);
		
		System.out.println(r);//Hello and welcome
		System.out.println(p);//Hello and welcome since the stringbuffer class is mutable the original string get changed. 
		
	}
}
