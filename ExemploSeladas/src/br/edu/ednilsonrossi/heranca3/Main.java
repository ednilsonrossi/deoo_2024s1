package br.edu.ednilsonrossi.heranca3;

public class Main {

	public static void main(String[] args) {
		
		Iinterface obj;
		obj = new Classe(20);
		obj.method();
		
		int v = 6;
		Iinterface noname;
		noname = new Iinterface() {
			@Override
			public void method() {
				System.out.println("Valor: " + v);
			}
		};
		noname.method();
	}
}
