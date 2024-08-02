package model;

public class Harmonic implements IAverageStrategy{
	private static Harmonic instance = null;
	public static Harmonic getInstance() {
		if (instance == null) {
			instance = new Harmonic();
		}
		return instance;
	}
	
	private Harmonic() {}

	@Override
	public double average(double... values) {
		double sum = 0.0;
		for(var value: values) {
			sum += 1 / value;
		}
		return values.length / sum;
	}
}
