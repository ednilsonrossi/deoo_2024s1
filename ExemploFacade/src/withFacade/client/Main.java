package withFacade.client;

import withFacade.logic.BancoFacade;

public class Main {

	public static void main(String[] args) {
		
		BancoFacade facade = new BancoFacade();
		
		// Abrir Conta
		facade.abrirConta(987, "Margarida");
		
		// Fazer deposito
		facade.depositar(987, 5000.0);
		
		// Fazer saque
		facade.sacar(987, 200.0);
		
	}
}
