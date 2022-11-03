package Java_Basics;

public class F1_Functionwithreturntype {
	
	public static void main(String[] args) {
		
		F1_Functionwithreturntype fun = new F1_Functionwithreturntype();
		int res=fun.add(10,20);
		int res1=fun.add();
		System.out.println(res);
		System.out.println(res1);		
		
	}
	
	public static int add(int a, int b)//function with parameters
	{
		int c=a+b;
		return c;
	}
	
	public static int add()//function without parameters
	{
		int c=10+40;
		return c;
	}

}
