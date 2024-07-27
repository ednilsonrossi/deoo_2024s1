package model;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Pizza {
	private final CrustType crust;
	private final SizeType size;
	private final String cheese;
	private final List<String> toppings;
	
	private Pizza(CrustType crust, SizeType size, String cheese, List<String> toppings) {
		this.crust = crust;
		this.size = size;
		this.cheese = new String(cheese);
		this.toppings = new LinkedList<String>(toppings);
	}

	public CrustType getCrust() {
		return crust;
	}

	public SizeType getSize() {
		return size;
	}

	public String getCheese() {
		return cheese.toString();
	}

	public List<String> getToppings() {
		return new ArrayList<String>(toppings);
	}
	
	@Override
	public String toString() {
		return "Pizza{" +
                "tamanho=" + size +
                ", massa=" + crust +
                ", queijo='" + cheese + '\'' +
                ", coberturas=" + toppings +
                '}';
	}

	public static class Builder{
		private CrustType crust;
		private SizeType size;
		private String cheese;
		private List<String> toppings;
		
		public Builder() {
			this.crust = CrustType.THIN;
			this.size = SizeType.DEFAULT;
			this.cheese = "mussarela";
			this.toppings = new LinkedList<String>();
		}
		
		public Builder crust(CrustType crust) {
			this.crust = crust;
			return this;
		}
		
		public Builder size(SizeType size) {
			this.size = size;
			return this;
		}
		
		public Builder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public Builder addTopping(String topping) {
			this.toppings.add(topping);
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this.crust, this.size, this.cheese, this.toppings);
		}
	}
	
}
