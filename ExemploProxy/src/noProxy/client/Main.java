package noProxy.client;

import java.util.NoSuchElementException;
import java.util.Scanner;

import noProxy.model.Fibonacci;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var fibo = new Fibonacci();
		
		int input;
		System.out.println("Qual posição deseja: ");
		input = scanner.nextInt();
		
		try {
			System.out.println("Fibonacci(" + input + ") = " + fibo.getTermo(input));
		}catch (NoSuchElementException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
