package javakids.pet;

public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep() {
		System.out.println("Споки! До завтра");
	}
	
	public void eat() {
		System.out.println("Я голоден давай жрать!");		
	}
	
	public String say(String aWord) { 
		String petResponse = "Ну ладно! " + aWord;
		return petResponse;
	}
}
