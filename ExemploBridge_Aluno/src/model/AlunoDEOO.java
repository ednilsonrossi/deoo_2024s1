package model;

public class AlunoDEOO extends Aluno{
	private int prova;
	private int trabalho;
	
	public AlunoDEOO(int prontuario, String nome, TransferType transfer, int prova, int trabalho) {
		super(prontuario, nome, transfer);
		this.prova = prova;
		this.trabalho = trabalho;
	}


	@Override
	public double getMedia() {
		int media = (prova + trabalho) / 2;
		return media / 10.0;
	}
}
