package view;

import model.Arithmetic;
import model.Average;
import model.Harmonic;
import model.IAverageStrategy;

public class Main {

	public static void main(String[] args) {
		Average average;
		double values[] = {10.0, 7.0, 15.5, 23.4, 8.8, 16.0, 42.1, 5.6, 9.9, 30.3};

		average = new Average(Arithmetic.getInstance());
		System.out.println("Média: " + average.calculate(values));
		
		average.setStrategy(Harmonic.getInstance());
		System.out.println("Média: " + average.calculate(values));
	}

}
