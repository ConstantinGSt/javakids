package javakids.tempconverter;

public class CalcTemp {
	public static void main(String[] args) {
		TemperatureConverter jdin = new TemperatureConverter();
		System.out.println(jdin.convertTemp(115, 'C'));
	}
}
