package Java_Basics;

public class G_StaticAndNonStatic {
	
	/*
	 * 18 sep start Time: 4:29 End Time:4:36
	 * 
	 * Q.can we call static methods using object.
	 * A.yes we can but it's not a good practice. 
	 * 
	 */
	
	public static void main(String[] args) {
		// cannot call a non-static with object creation
		//static method can be directly called using
		
		//static functions
		add();
		G_StaticAndNonStatic.add();
		
		//Non-static  functions
		G_StaticAndNonStatic nonsta= new G_StaticAndNonStatic();
		nonsta.sub();
		
	}

	public static void add()
	{
		System.out.println("testing add");
	}
	
	public void sub()
	{
		System.out.println("testing sub");
	}
	

}
