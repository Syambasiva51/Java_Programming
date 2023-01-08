//non-static 
	//void means does not return anything
	
// method inside method is not possible
//method inside class is possible
	
//A method is a block of code which only runs when it is called.
	/*
	 * 3 types of functions or methods in java:
	 * 1. No input - No output
	 * 2.No input  - still get some output
	 * 3.Pass some input - get some input
	 */

package Java_Basics;

public class F_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F_Functions obj = new F_Functions();
		
		obj.test();
		obj.getPrint();
		
		obj.getBalance();
		obj.getTrainerName();
		obj.isEmpActive();
		
		int val =obj.add(10, 20);
		System.out.println(val);
		
		
		//main method is void because we never write the return inside the main method
		}
	
	
	
	
	//1. no input and no return
	//void - no return
	public void test() {
		System.out.println("test method");
		int i = 10;//local
		System.out.println(i);
	}
	
	public void getPrint() {
		System.out.println("print my paper");
	}
	
	//2. no input but some return
	//return type: int
	public int getBalance() {
		System.out.println("get balance");
		int fee = 10;
		int tax = 5;
		int total = fee+tax;//15
		return total;
	}
	
	//2. no input but some return
		//return type: String
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	//2. no input but some return
		//return type: boolean
	
	public boolean isEmpActive() {
		System.out.println("is emp active");
		return true;
	}
	
	//3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method");
		int z = a+b;
		return z;
	}

	
	
}
