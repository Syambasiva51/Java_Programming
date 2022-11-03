package AccessModifiers;
/*
 * 3.SubClass (same package):
 * 
 * default method can be access inside subclass within same package 
 * 
 */
public class F_Default_SamePackage_SubClass extends D_Default_SamePackage_SameClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_Default_SamePackage_SameClass de = new D_Default_SamePackage_SameClass();
		de.defaultprint();

	}

}
