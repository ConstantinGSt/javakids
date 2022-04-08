package javakids.pet;

public class FishMaster {
	public static void main(String[] args) {
		Fish goldFish = new Fish();
		goldFish.dive(2);
		goldFish.dive(25);
		goldFish.sleep();
		
		System.out.println(goldFish.say("Шалом"));
	}

}
