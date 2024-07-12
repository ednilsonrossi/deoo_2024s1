package noFacade.logic;

public final class Transacao {
	private final Conta conta;
	private final TransacaoEnum transacaoEnum;
	private final double valor;
	
	public Transacao(Conta conta, TransacaoEnum transacaoEnum, double valor) {
		this.conta = conta;
		this.transacaoEnum = transacaoEnum;
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public TransacaoEnum getTransacaoEnum() {
		return transacaoEnum;
	}

	public double getValor() {
		return valor;
	}
	
}
