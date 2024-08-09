package br.edu.ednilsonrossi.model;

public final class Clothing extends Product {
	private final String size;
	private final String material;
	
	public Clothing(String name, double price, String size, String material) {
		super(name, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Clothing [size=" + size 
				+ ", material=" + material 
				+ ", getName()=" + getName() 
				+ ", getPrice()=" + getPrice() + "]";
	}
	
}
