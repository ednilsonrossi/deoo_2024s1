package withFacade.logic;

public final class Cliente {
	private final String nome;

	public Cliente(String nome) {
		this.nome = new String(nome);
	}

	public String getNome() {
		return nome;
	}
	
}
