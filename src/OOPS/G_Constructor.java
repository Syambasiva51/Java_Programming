package OOPS;
/*
 * StartTime sep 24th: 3:58
 * 
 * https://beginnersbook.com/2013/03/constructors-in-java/
 */

public class G_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G_Constructor obj = new G_Constructor();
		G_Constructor obj1 = new G_Constructor("test");
		obj1.print();
		

	}
	public void print()
	{
		System.out.println("Testing");
	}
	
	public G_Constructor()
	{
		System.out.println("Constructor Method");
	}
	
	public  G_Constructor(String str)
	{
		System.out.println(str);
	}
	
}
