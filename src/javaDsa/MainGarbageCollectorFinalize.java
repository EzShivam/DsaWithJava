package javaDsa;

import javaDsa.GarbagCollector;

public class MainGarbageCollectorFinalize {
	
	public static void main(String[] args) {
		GarbagCollector ob1 = new GarbagCollector();
		
		ob1.empId = 102;
		ob1.empName = "Lisan";
		
		ob1 = null; //way to collect the garbage
		
		System.gc();
	}
	
}
