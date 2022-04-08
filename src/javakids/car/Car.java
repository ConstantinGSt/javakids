package javakids.car;

public class Car {
	int distance;
	
	public void start() {
		System.out.println("тырр пых пых, тыр, пых, тыр ты тырррр");		
	}
	
	public void stop() {
		System.out.println("тыр тры чшшшпыхтпррапрпрп...");
		
	}
	
	public int drive(int howlong) {
		distance = howlong * 60;
		return distance;
	}

}
