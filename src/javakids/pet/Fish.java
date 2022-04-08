package javakids.pet;

public class Fish extends Pet {
	int currentDepth = 0;
	
	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
			System.out.println("Ныряю на глубину " + howDeep + " футов");
			System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
			return currentDepth;
	}
	
	public String say(String aWord) {
		return "я рыпка гаваритт не умей!";
	}
}
