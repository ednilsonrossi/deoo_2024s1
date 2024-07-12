package noFacade.logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Transacoes {
	private List<Transacao> transacoes;

	public Transacoes() {
		transacoes = new LinkedList<Transacao>();
	}
	
	public final void registrar(Conta conta, TransacaoEnum tipo, double valor) {
		transacoes.add(new Transacao(conta, tipo, valor));
	}
	
	public final List<Transacao> getTransacoes(){
		return new ArrayList<Transacao>(transacoes);
	}
}
