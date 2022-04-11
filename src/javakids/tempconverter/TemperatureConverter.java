package javakids.tempconverter;

public class TemperatureConverter {

	public float convertTemp(int temperature, char convertTo) {
		float yourTemper = 0;
		if(convertTo == 'F') {
			yourTemper = temperature * 1.8f + 32;
		} else if(convertTo == 'C' ) {
			yourTemper = (temperature - 32) / 1.8f;
		}		
		return yourTemper;
	}
	
}
