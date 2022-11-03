package OOPS;

/*
 * 1.A class that is declared using “abstract” keyword is known as abstract class
 * 2. It can have abstract methods(methods without body) as well as concrete methods (regular methods with body).
 * 3.A normal class(non-abstract class) cannot have abstract methods. 
 * 
 * Note:An abstract class can not be instantiated, which means you are not allowed to create an object of it
 * 
 * 
 * https://beginnersbook.com/2013/05/java-abstract-class-method/
 */
abstract class Animal{
	   //abstract method
	   public abstract void sound();
	   public abstract void colour();
	   
	   public void Forest()
	   {
		   System.out.println("forest method");
	   }
	}
