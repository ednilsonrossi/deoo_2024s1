package exemplo_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        String line;
        File file = new File("/home/ednilson/alunos.txt");

        /*
         * Em resumo, o escopo do objeto bufferedReader é limitado ao try,
         * ao final desse bloco o objeto é fechado automaticamente, devido
         * a interface AutoCloseable.
         */
        try (var bufferedReader = new BufferedReader(new FileReader(file))){

            line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
