package model;

public abstract class Aluno {
	private int prontuario;
	private String nome;
	private TransferType transfer;
	
	public Aluno(int prontuario, String nome, TransferType transfer) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.transfer = transfer;
	}

	/* getters e setters*/
	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TransferType getTransfer() {
		return transfer;
	}

	public void setTransfer(TransferType transfer) {
		this.transfer = transfer;
	}
	
	public abstract double getMedia();

	@Override
	public String toString() {
		return transfer.getData(prontuario, nome, getMedia());
	}
}
