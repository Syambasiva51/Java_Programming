package B_AccessModifier;

import AccessModifiers.A_Protected_SamePackage_SameClass;

/*
 *4.SubClass (Different package):
 *
 * protected method can be accessed outside package but we need to import
 * the package and extent the parent class
*/
public class A_Protected_DiffPackage_Subclass extends A_Protected_SamePackage_SameClass{
	
	public static void main(String[] args) {
		A_Protected_DiffPackage_Subclass sub = new A_Protected_DiffPackage_Subclass();
		sub.add();
		
		
	}

}
