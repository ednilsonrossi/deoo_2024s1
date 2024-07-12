package withFacade.logic;


public class BancoFacade {
	private Contas contas;
	private Transacoes transacoes;
	private Notificacao notificacao;
	
	public BancoFacade() {
		contas = new Contas();
		transacoes = new Transacoes();
		notificacao = new Notificacao();
	}
	
	public void abrirConta(int numero, String nomeCliente) {
		var conta = new Conta(numero, nomeCliente );
		contas.add(conta);
		notificacao.enviarNotificacao(conta.getCliente().getNome(), "Nova conta aberta.");
	}
	
	public void depositar(int numero, double valor) {
		var conta = contas.getConta(numero);
		if(conta != null) {
			conta.deposito(valor);
			transacoes.registrar(conta, TransacaoEnum.CREDITO, valor);
			notificacao.enviarNotificacao(conta.getCliente().getNome(), "Depósico de R$ " + valor + " realizado na conta.");
		}
	}
	
	public void sacar(int numero, double valor) {
		var conta = contas.getConta(numero);
		if(conta.saque(valor)) {
			transacoes.registrar(conta, TransacaoEnum.DEBITO, 200);
			notificacao.enviarNotificacao(conta.getCliente().getNome(), "Saque de R$ " + valor + " realizado na conta.");
		}else {
			notificacao.enviarNotificacao(conta.getCliente().getNome(), "Tentativa de saque não realizada por saldo insuficiente.");
		}
	}
}
