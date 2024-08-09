package br.edu.ednilsonrossi.model;

public final class Electronics extends Product {
	private final String brand;
	private final int warrantyPeriod; // em meses
	
	public Electronics(String name, double price, String brand, int warrantyPeriod) {
		super(name, price);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}

	public String getBrand() {
		return brand;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	@Override
	public String toString() {
		return "Electronics [brand=" + brand 
				+ ", warrantyPeriod=" + warrantyPeriod 
				+ ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}
}
