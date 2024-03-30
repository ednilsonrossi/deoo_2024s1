package exemplo_2;

import java.io.*;

public class Main {
    public static void main(String[] args){

        String line;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        File file = new File("/home/ednilson/alunos.txt");

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            /*
             * Fechar bufferedReader e FileReader pode gerar
             * uma exceção, assim, é preciso tratar a exceção
             * dentro do finally.
             */
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
