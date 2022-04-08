package javakids.car;

public class JamesBondCar extends Car {
	
	public int drive(int time) {
		distance = time * 180;
		return distance;
	}

}
