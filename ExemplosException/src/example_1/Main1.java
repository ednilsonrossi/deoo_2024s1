package example_1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        var name = scanner.nextLine();
        System.out.println("Bem-vindo " + name.trim().toUpperCase());
    }
}
