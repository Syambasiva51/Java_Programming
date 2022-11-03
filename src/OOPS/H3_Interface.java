package OOPS;

public class H3_Interface extends H2_Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H3_Interface obj = new H3_Interface();
		obj.creditcard();
		obj.debitcard();
		obj.savings();

	}
	@Override
	public void debitcard() {
		System.out.println("debit card");
		
	}

}
