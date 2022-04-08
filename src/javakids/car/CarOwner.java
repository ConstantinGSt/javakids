package javakids.car;

public class CarOwner {
	public static void main(String[] args) {
		
	Car uaz = new Car();
	JamesBondCar bip = new JamesBondCar();
	
	uaz.start();
	System.out.println(uaz.drive(5));
	uaz.stop();
	
	System.out.println(bip.drive(5));
	}	

}
