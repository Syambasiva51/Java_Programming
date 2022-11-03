//polymorphiscm
package OOPS;
/*
 * MethodOverLoading
 * StartTime: 1:54:00
 * EndTime:2:18:00`
 * Method Overloading is a feature that allows a class to have multiple 
 * methods with the same name but with different number, sequence or type of parameters.
 * 
 */

public class C_MethodOverLoading {

	public static void main(String[] args) {
		//creating multiple methods or functions  with same name but different parameters is called method overloading
		C_MethodOverLoading me = new C_MethodOverLoading();
		me.add();		
		me.add("testing oops");

	}
	
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum of value is"+c);
	}
//1.Number of parameters : same method name but different number of parameters
	public void add(String st)
	{
		System.out.println(st);
	}
	public void add(String st,String st1)
	{
		System.out.println(st);
		System.out.println(st1);
	}
//2.data type of the Parameter	 : same method name same number of parameters but different data types
	public void add1(int a,int b)
	{
		System.out.println(a);
	}
	public void add1(int a, float b)
	{
		System.out.println(a+b);
	}
//3.Sequence of Parameters:  same method name same,same no of parameters,same data types but sequence change

	public void add2(int a,float b)
	{
		System.out.println(a);
	}
	public void add2(float b,int a)
	{
		System.out.println(a+b);
	}
}
