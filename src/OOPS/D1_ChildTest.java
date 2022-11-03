package OOPS;

public class D1_ChildTest extends D_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//methods with same name both in parent and child
		D1_ChildTest me = new D1_ChildTest();
		me.print();

	}

	public void print()
	{
		System.out.println("print child Test method overide Example");
	}
}
