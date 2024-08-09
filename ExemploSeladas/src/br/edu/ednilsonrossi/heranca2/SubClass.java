package br.edu.ednilsonrossi.heranca2;

public class SubClass extends AbstractClass{

	public SubClass(int v) {
		super(v);
	}

	@Override
	public void method() {
		System.out.println("Value: " + value);
	}
}
