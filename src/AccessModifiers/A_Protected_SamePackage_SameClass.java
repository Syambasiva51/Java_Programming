package AccessModifiers;
/*Sep 25th StartTime: 50 min
 * 
 * 1.class --yes
 * 2.package--yes
 * 3.subclass (Samepackage) --yes
 * 4.subclass (diffpackage) --yes
 * 5.outside class  --no
 * 
 * 1.class:
 * protected method inside the class can be accessed --Yes
 */
import Java_Basics.F0_FunctionCalculatorExample;

public class A_Protected_SamePackage_SameClass {
	
	
	
	public static void main(String[] args) {
		
		A_Protected_SamePackage_SameClass pe =new A_Protected_SamePackage_SameClass();
		
		pe.add();
	}


	protected void add()
	{
		System.out.print("Protected Method");
	}
	
}
