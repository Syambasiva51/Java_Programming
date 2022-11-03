package AccessModifiers;

/*2.Package:
  protected method can be accessed inside same package and but different class using object creation
*/
public class B_Protected_SamePackage_DiffClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A_Protected_SamePackage_SameClass pe=new A_Protected_SamePackage_SameClass();
	   	 pe.add();

	}

}
