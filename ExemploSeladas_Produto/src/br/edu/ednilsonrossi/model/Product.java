package br.edu.ednilsonrossi.model;

public sealed class Product 
	permits Electronics, Food, Clothing {
	
	private final String name;
	private final double price;
	
	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
