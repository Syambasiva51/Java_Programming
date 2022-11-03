package Java_Basics;


public class F0_FunctionCalculatorExample {
	
public static void main(String[] args) {
	
	F0_FunctionCalculatorExample cal =new F0_FunctionCalculatorExample();
	F0_FunctionCalculatorExample cal1 =new F0_FunctionCalculatorExample();
	F0_FunctionCalculatorExample cal2 =new F0_FunctionCalculatorExample();
	
	
	cal.add();
	cal.sub();
	cal.div();
	cal.mul();
	
	cal1.add();
	cal2.add();
	
}
	
public static void add()
{
	System.out.println("add");
}

public static void sub()
{
	System.out.println("sub");
}

public static void div()
{
	System.out.println("div");
}
public static void mul()
{
	System.out.println("mul");
}
}
