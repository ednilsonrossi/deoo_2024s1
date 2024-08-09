package br.edu.ednilsonrossi.heranca2;

public class Main {

	public static void main(String[] args) {
		AbstractClass obj = new SubClass(20);
		
		obj.method();
		
		AbstractClass noname = new AbstractClass(10) {
			@Override
			public void method() {
				System.out.println("Noname: " + value);
			}
		}; 
	}
	
}
