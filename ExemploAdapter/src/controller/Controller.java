package controller;

import dto.AbastecimentoDto;
import model.Abastecimento;
import model.AbastecimentoAdapter;
import model.usafuel_adaptee.FuelType;
import view.View;

public class Controller {

	private final double DOLAR_HOJE = 5.45;
	private View view;

	public Controller(View view) {
		this.view = view;
	}
	
	public void run() {
		
		do {
			
			AbastecimentoDto dto = view.lerAbastecimento();
			FuelType tipo;
			if(dto.getTipoCombustivel().equalsIgnoreCase("gasolina")) {
				tipo = FuelType.GAS;
			} else if (dto.getTipoCombustivel().equalsIgnoreCase("etanol")) {
				tipo = FuelType.ETHANOL;
			} else {
				tipo = FuelType.DIESEL;
			}
			Abastecimento abastecimento = new AbastecimentoAdapter(tipo, dto.getLitros(), dto.getPrecoLitro(), DOLAR_HOJE);
			
			view.mostarTotalPagar(abastecimento.getTotalPagar());
			
		}while (!view.encerrarDia());
		
	}
}
