package view;

import dto.AbastecimentoDto;

public interface View {

	boolean encerrarDia();
	
	AbastecimentoDto lerAbastecimento();
	
	void mostarTotalPagar(double valor);
	
}
