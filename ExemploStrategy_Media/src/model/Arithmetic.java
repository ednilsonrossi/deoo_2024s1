package model;

public class Arithmetic implements IAverageStrategy{
	private static Arithmetic instance = null;
	public static Arithmetic getInstance() {
		if (instance == null) {
			instance = new Arithmetic();
		}
		return instance;
	}

	private Arithmetic() {}

	@Override
	public double average(double... values) {
		double sum = 0;
		for(var value: values) {
			sum += value;
		}
		return sum / values.length;
	}
}
