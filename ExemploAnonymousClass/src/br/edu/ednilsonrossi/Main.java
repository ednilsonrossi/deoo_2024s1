package br.edu.ednilsonrossi;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.falar();
		
		Aluno aluno2 = new Aluno() {
			@Override
			public void falar() {
				System.out.println("Professor, pode tirar minhas faltas?");
			}
		};
		aluno2.falar();
		
		
		IAluno aluno3 = new IAluno() {
			@Override
			public void falar(String text) {
				System.out.println(text);
			}
		};
		aluno3.falar("Professor, arredonda meus 2.5 para 6.0?");
	}
	
}
