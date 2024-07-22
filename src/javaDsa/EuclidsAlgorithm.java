package javaDsa;

import java.util.Scanner;

public class EuclidsAlgorithm {
     static int calHcf(int a, int b) {
    	 while(a!=0 && b!=0) {
    		 if(a>b) {
    			 a=a%b;
    		 }else {
    			 b=b%a;
    		 }
    	 }
    	 if(a!=0) {
    		 return a;
    	 }else {
    		 return b;
    	 }
     }
     
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 
    	 System.out.println("the hcf of two no is="+calHcf(a,b));
    	}
}
