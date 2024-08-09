package br.edu.ednilsonrossi.model;

public final class Food extends Product {
	private final String expirationDate;

	public Food(String name, double price, String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	@Override
	public String toString() {
		return "Food [expirationDate=" + expirationDate 
				+ ", getName()=" + getName() 
				+ ", getPrice()=" + getPrice() + "]";
	}
	
}
