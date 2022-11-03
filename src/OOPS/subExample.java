package OOPS;
/*
 * Super class: SEP 25: 3:58
 * 
 * can access methods common in both parent and child and only parent methods alone. Not the methods only in child
 * class
 */
public class subExample extends SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample se1 = new subExample();//type casting
		//se1.mul();
		//se1.div();
		se1.add();
		se1.sub();

	}
	
	public void mul()
	{
		System.out.println("mul");
	}

	public void div()
	{
		System.out.println("div");
	}
	public void add()
	{
		System.out.println("child add");
	}

}
