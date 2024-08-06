package javaDsa;

public class GarbagCollector {
	
	
	
	public String empName;
	public int empId;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("The object ob1 get released");
	}

}
