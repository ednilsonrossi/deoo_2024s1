package br.edu.ednilsonrossi.heranca1;

public class SubClass extends SuperClass{

	public SubClass() {
		super(0);
	}

	@Override
	public void method() {
		System.out.println("Big Result:");
		super.method();
	}
}
