package OOPS;

public class H1_interfaceImplementation implements H_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H1_interfaceImplementation obj = new H1_interfaceImplementation();
		obj.creditcard();
		obj.debitcard();
		obj.savings();
		

	}

	@Override
	public void debitcard() {
		System.out.println("debit card");
		
	}

	@Override
	public void creditcard() {
		System.out.println("credit card");
	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("savings  card");
		
	}

}
