package javakids.pet;

public class FishMaster {
	public static void main(String[] args) {
		Fish goldFish = new Fish();
		
		goldFish.dive(10);
		goldFish.dive(150);
		goldFish.sleep();
		
		System.out.println(goldFish.say("Шалом"));
		
		Fish dark = new Fish(25);
		
	}

}
