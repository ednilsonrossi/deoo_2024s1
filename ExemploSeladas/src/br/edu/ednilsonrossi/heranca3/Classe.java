package br.edu.ednilsonrossi.heranca3;

public class Classe implements Iinterface{

	private int value;

	public Classe(int value) {
		super();
		this.value = value;
	}

	@Override
	public void method() {
		System.out.println("Value: " + value);
	}
}
