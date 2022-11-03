package AccessModifiers;

/*
*  1.class --yes
 * 2.package --No
 * 3.subclass(same package) --No
 * 4.subclass(diff package) --no
 * 5.outside class --no
 * 
 * private methods can be accessiable
 */
public class F_PrivateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F_PrivateExample pe1= new F_PrivateExample();
		pe1.privateprint();
	}

private void privateprint()
{
	System.out.print("private message");
}
}
