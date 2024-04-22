package view;

import java.util.Scanner;

import dto.AbastecimentoDto;

public class Console implements View{

	private final Scanner scanner;
	
	public Console() {
		scanner = new Scanner(System.in);
	}
	
	@Override
	public boolean encerrarDia() {
		int encerrar = 0;
		System.out.println("Encerrar o dia? (1 - SIM | 2 - NÃO) ");
		encerrar = scanner.nextInt();
		scanner.nextLine();
		return encerrar == 1;
	}

	@Override
	public AbastecimentoDto lerAbastecimento() {
		System.out.println("Tipo de combustível");
		String tipo = scanner.nextLine();
		System.out.println("Litros: ");
		double litros = scanner.nextDouble();
		System.out.println("Preço do litro: ");
		double preco = scanner.nextDouble();
		scanner.nextLine();
		return new AbastecimentoDto(tipo, litros, preco);
	}

	@Override
	public void mostarTotalPagar(double valor) {
		System.out.println(String.format("Total à pagar: R$ %.2f", valor));
	}

}
