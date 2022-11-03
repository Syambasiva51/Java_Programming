package Java_Basics;

public class H_LocalGlobalVariable {
	
/*Timing 24th Sep
 * Start Time: 1:02:00
 * end Time:1:33:00
 * 
 * https://www.javatpoint.com/java-variables
 * https://beginnersbook.com/java-tutorial-for-beginners-with-examples/
 */
	
//globalvariables
	
	static String st = "java session"; //static global variable
	
	int i = 10;  //non-static global variable
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		H_LocalGlobalVariable obj = new H_LocalGlobalVariable();
		obj.add();
		sub();
		int b= 20;
		int c = obj.i + b;	
		System.out.println("printing Static variable"+ st);
		System.out.println("printing non-static variable"+ obj.i);
		obj.st="updated value";// we can change the value of static global variable using Object
		obj.i=20;
		System.out.println("printing Static variable"+ st);//static variable can be called directly
		System.out.println("printing non-static variable"+ obj.i);//non-static should be called with object reference only
			

	}
	
public void add()
{
	//local variable
	int a = 10;
	System.out.println(a);	
	System.out.println(st);// global static variable can be directly used inside static and non-static methods
	System.out.println(i); // global non-static variable can be used directly inside only non-static methods
}

public static void sub()
{
	//H_LocalGlobalVariable obj = new H_LocalGlobalVariable();
	System.out.println(H_LocalGlobalVariable.st);//
	//System.out.println(obj.i); //global non-static variable cannot be used directly inside only non-static methods
	
}
}
