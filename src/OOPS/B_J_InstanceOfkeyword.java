package OOPS;

//Single level Inheritance: single child class inherits the properties and methods of a single parent class
class A{
}
class B extends A{
}

//In multilevel inheritance, a parent class becomes the child class of another class
class A1{
}
class B1 extends A1{
}

class c1 extends B1{	
}

//In hierarchical inheritance, more than one class extends the same class.
class A2{	
}
class B2 extends A2{	
}
class c2 extends A2{
}
class d2 extends A2{
}

//Hybrid inheritance: Combination of more than one types of inheritance in a single program.

class A3{	
}
class B3 extends A3{	
}
class c3 extends A3{	
}
class d3 extends c3{	
}

//Multiple Inheritance: one class extending more than one classes, 
//which means a child class has more than one parent classes 
//java doesnot allow

class A5
{
	
}
class B5
{
	
}
/*class C5 extends A5,B5
{ 
	//is not allowed
	
}
*/

public class B_J_InstanceOfkeyword extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Java Inheritance instanceof keyword
 * The instanceof keyword returns true, if an object belongs to the class or its parent class.
 * 
 */
		A obj1 = new A();
		B obj2 = new B();
		B_J_InstanceOfkeyword obj3 = new B_J_InstanceOfkeyword();
		
		System.out.println(obj1 instanceof A);
		System.out.println(obj2 instanceof A);
		System.out.println(obj3 instanceof A);
		System.out.println(obj1 instanceof B);
	}
	
	

}
