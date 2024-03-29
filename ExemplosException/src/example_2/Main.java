package example_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[10];
        int number = 0;

        try{
            System.out.println("Digite um número: ");
            System.in.read(bytes);
            number = Integer.parseInt(new String(bytes).trim());
        } catch (IOException e){
            System.out.println("Ocorreu um erro e o número não pode ser lido.\n");
            System.err.println("Mensagem: " + e.getMessage());
            number = 0;
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o número lido.");
            System.err.println("Mensagem: " + e.getMessage());
            number = 0;
        } catch (Exception e){
            System.out.println("Erro desconhecido.");
            System.err.println("Mensagem: " + e.getMessage());
        } finally {
            System.out.printf("Dobro de %d é %d.\n", number, number * 2);
        }
    }
}
