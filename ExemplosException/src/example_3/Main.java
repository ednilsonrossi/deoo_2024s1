package example_3;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] nros = new int[5];

        try {
            i = 0;
            do {
                nros[i] = input.nextInt();
                i++;
            } while (true);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array cheio.");
            System.err.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Entrada de dados incorreta. O dado não é um número inteiro.");
            System.err.println(e.getMessage());
        }catch (NoSuchElementException e) {
            System.out.println("Não existem dados para leitura.");
            System.err.println(e.getMessage());
        }catch (IllegalStateException e){
            System.out.println("Objeto de leitura (scanner) está fechado.");
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Erro desconhecido.");
            System.err.println(e.getMessage());
        }
    }
}