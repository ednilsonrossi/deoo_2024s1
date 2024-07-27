package view;

import java.util.Scanner;

import model.SlotMachine;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		int option, coins;
		SlotMachine machine = new SlotMachine();
		
		System.out.println("Quantidade de moedas: ");
		coins = scanner.nextInt();
		
		do {
			System.out.println("\n\n1 - Jogar");
			System.out.println("2 - Sair");
			System.out.print("Opção: ");
			option = scanner.nextInt();
			if(option == 1) {
				coins = coins - 1;
				machine.play();
				if(machine.bigWinner()) {
					coins += 10;
				} else if (machine.winner()) {
					coins += 2;
				}
			}
			System.out.println(machine.getDisplay());
			System.out.println("Moedas: " + coins);
		}while(option == 1 && coins > 0);
		scanner.close();
	}
}
