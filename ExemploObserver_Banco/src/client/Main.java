package client;

import model.Account;
import model.Manager;
import model.Vendor;

public class Main {
	public static void main(String[] args) {
		Manager gerente = new Manager();
		Vendor vendedor = new Vendor();
		
		Account conta = new Account(123);
		conta.attach(gerente);
		conta.attach(vendedor);
		
		conta.deposit(5000.0);
		System.out.println(conta);
		
		conta.draft(500.0);
		System.out.println(conta);
		
		conta.draft(4000.0);
		System.out.println(conta);
		
		conta.draft(1000.0);
		System.out.println(conta);
	}
}
