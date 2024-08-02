package model;

public class Average {
	private IAverageStrategy strategy;

	public Average(IAverageStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double calculate(double... values) {
		return strategy.average(values);
	}

	public void setStrategy(IAverageStrategy strategy) {
		this.strategy = strategy;
	}
	
}
