package br.edu.ednilsonrossi.heranca1;

public class Main {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(100);
		superClass.method();
		
		SubClass subClass = new SubClass();
		subClass.method();
		
		SuperClass obj = new SubClass();
		obj.method();
	}
}
