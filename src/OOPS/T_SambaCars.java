package OOPS;

public class T_SambaCars implements T_CarsInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T_SambaCars se = new T_SambaCars();
		se.accel();
		se.horn();
		se.start();
		se.stop();
		se.music();
		
		T_CarsInterface se1 = new T_SambaCars();
		se1.accel();
		se1.start();
		se1.stop();
		se1.horn();
	}

	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("horn");
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		System.out.println("accelerator");
	}
	
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("music");
	}

}
