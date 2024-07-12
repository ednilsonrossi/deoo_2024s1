package withProxy.client;

import java.util.NoSuchElementException;
import java.util.Scanner;

import withProxy.model.FibonacciProxy;
import withProxy.model.IFibonacci;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		IFibonacci fibo = new FibonacciProxy();
		
		int input;
		
		do {
			System.out.println("Qual posição deseja: ");
			input = scanner.nextInt();
			
			try {
				System.out.println("Fibonacci(" + input + ") = " + fibo.getTermo(input));
			}catch (NoSuchElementException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}while(input != 0);
	}
}
