package AccessModifiers;
/*
 * 1.class --yes
 * 2.package --yes
 * 3.subclass(same package) --yes
 * 4.subclass(diff package) --no
 * 5.outside class --no
 * 
 * 
 * 1.class:same class
 */
public class D_Default_SamePackage_SameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D_Default_SamePackage_SameClass de = new D_Default_SamePackage_SameClass();
		de.defaultprint();
		

	}

	void defaultprint()
	{
		System.out.print("default");
	}
}
