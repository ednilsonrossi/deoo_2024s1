package model;

import model.usafuel_adaptee.Fuel;
import model.usafuel_adaptee.FuelType;

public class AbastecimentoAdapter implements Abastecimento{

	private final double GALLON = 3.78451;
	private Fuel adaptee;
	private double cotacaoDolar;

	public AbastecimentoAdapter(FuelType type, double litros, double precoPorLitro, double cotacaoDolar) {
		int galoes = (int)(litros / GALLON); 
		if(litros / GALLON - galoes >= 0.25) {
			galoes++;
		}
		
		double precoEmDolar = (precoPorLitro * GALLON) / cotacaoDolar;
		this.adaptee = new Fuel(type, galoes, precoEmDolar);
		this.cotacaoDolar = cotacaoDolar;
	}

	@Override
	public double getLitros() {
		return adaptee.getGallons() * 3.78541;
	}

	@Override
	public double getPrecoPorLitro() {
		return (adaptee.getPricePerGallon() / GALLON) * cotacaoDolar;
	}

	@Override
	public double getTotalPagar() {
		return adaptee.amountToPay() * cotacaoDolar;
	}
}
