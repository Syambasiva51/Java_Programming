package OOPS;

public class B_InheritanceChild extends A_InheritanceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B_InheritanceChild ch = new B_InheritanceChild();
		ch.div();
		ch.mul();
		ch.add();//inherited from parent class
		ch.sub();//inherited from parent class
	}
	
	public void div()
	{
		System.out.println("division with in the child class");
	}

	public void mul()
	{
		System.out.println("multiplication with in the child class");
	}

}
