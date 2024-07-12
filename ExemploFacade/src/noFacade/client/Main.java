package noFacade.client;

import noFacade.logic.Conta;
import noFacade.logic.Contas;
import noFacade.logic.Notificacao;
import noFacade.logic.TransacaoEnum;
import noFacade.logic.Transacoes;

public class Main {

	public static void main(String[] args) {
		Conta operacao;
		Contas contas = new Contas();
		Transacoes transacoes = new Transacoes();
		Notificacao notificacao = new Notificacao();
		
		// Abrir Conta
		Conta novaConta = new Conta(987, "Margarida");
		contas.add(novaConta);
		notificacao.enviarNotificacao(novaConta.getCliente().getNome(), "Nova conta aberta.");
		
		
		
		// Fazer deposito
		operacao = contas.getConta(987);
		operacao.deposito(5000.0);
		transacoes.registrar(operacao, TransacaoEnum.CREDITO, 5000);
		notificacao.enviarNotificacao(operacao.getCliente().getNome(), "Depósico de R$ " + 5000.00 + " realizado na conta.");
		
		
		// Fazer saque
		operacao = contas.getConta(987);
		if(operacao.saque(200)) {
			transacoes.registrar(operacao, TransacaoEnum.DEBITO, 200);
			notificacao.enviarNotificacao(operacao.getCliente().getNome(), "Saque de R$ " + 200.00 + " realizado na conta.");
		}else {
			notificacao.enviarNotificacao(operacao.getCliente().getNome(), "Tentativa de saque não realizada por saldo insuficiente.");
		}
		
	}
	
}
