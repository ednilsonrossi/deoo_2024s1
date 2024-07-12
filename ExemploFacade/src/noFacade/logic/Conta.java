package noFacade.logic;

public class Conta {
	private final int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.saldo = 0.0;
		this.cliente = new Cliente(cliente);
	}
	
	public final void deposito(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public final boolean saque(double valor) {
		if(valor > 0) {
			if(saldo >= valor) {
				saldo -= valor;
				return true;
			}
		}
		return false;
	}

	public final int getNumero() {
		return numero;
	}

	public final double getSaldo() {
		return saldo;
	}

	public final Cliente getCliente() {
		return new Cliente(cliente.getNome());
	}
	
	
}
