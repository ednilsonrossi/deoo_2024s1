package model.usafuel_adaptee;

public final class Fuel {

	private final FuelType fuelType;
	private final int gallons;
	private final double pricePerGallon;
	
	public Fuel(FuelType fuelType, int gallons, double pricePerGallon) {
		this.fuelType = fuelType;
		this.gallons = gallons;
		this.pricePerGallon = pricePerGallon;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public int getGallons() {
		return gallons;
	}

	public double getPricePerGallon() {
		return pricePerGallon;
	}
	
	public double amountToPay() {
		// Este é um cálculo complexo no exemplo!
		return pricePerGallon * gallons;
	}
	
}
