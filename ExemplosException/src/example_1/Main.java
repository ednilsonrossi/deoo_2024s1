package example_1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        byte[] inputData = new byte[40];

        try {
            System.out.println("Digite seu nome:");
            System.in.read(inputData);

            System.out.println("Bem-vindo " + new String(inputData).trim().toUpperCase());
        } catch (IOException e){
            System.err.println("Erro ao ler entrada de dados: " + e.getMessage());
        }

    }

}
