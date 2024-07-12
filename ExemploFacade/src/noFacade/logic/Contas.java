package noFacade.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contas {
	private Map<Integer, Conta> contas;
	
	public Contas() {
		contas = new HashMap<>();
		mockData();
	}
	
	public void add(Conta conta) {
		contas.put(conta.getNumero(), conta);
	}
	
	public Conta getConta(int numero) {
		return contas.get(numero);
	}
	
	private final void mockData() {
		contas.put(123, new Conta(123, "Tio Patinhas") );
		contas.put(222, new Conta(222, "Pato Donald"));
		contas.put(999, new Conta(999, "Pão Duro McMoney"));
	}
}
