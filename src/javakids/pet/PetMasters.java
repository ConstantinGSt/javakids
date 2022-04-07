package javakids.pet;

public class PetMasters {

	public static void main(String[] args) {
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("Ла ла лалала");
		
		System.out.println(petReaction);
		
		myPet.sleep();
		
	}

}
