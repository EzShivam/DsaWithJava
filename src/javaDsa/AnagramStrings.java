package javaDsa;

import java.util.Scanner;

public class AnagramStrings {
	//anagram strings are the strings which includes same characters 
	//e.g s1=anagram and s2=nagaram  -- are anagram strings
	
	//test cases:
	//1. s=anagram t=nagaram result : true
	//2. s=pen  t=nap  result : flase
	
	
	public static boolean isAnagram (String s, String t) {
		int m = s.length();
		int n = t.length();
		
		//check if both strings are equal length
		if(m!=n) {
			return false;
		}else {
			//taking char arr of size 26 since there are 26 alphabets.
			
			int[] arr = new int[26];
			
			for(int i=0;i<m;i++) {
				arr[s.charAt(i)-'a']++;//a=3,n=1,g=1,r=1,m=1(frequency).
			}
			for(int i=0;i<n;i++) {
				arr[t.charAt(i)-'a']--;//a=0,n=0,g=0,r=0,m=0(frequency).
			}
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					return false;
				}
			}
			return true;
		}
	}
	
	
	
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		boolean res = isAnagram(s1,s2);
		System.out.println("are given strings anagram : "+res);
	}
}
