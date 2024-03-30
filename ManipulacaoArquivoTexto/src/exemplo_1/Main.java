package exemplo_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = null;
        File file = new File("/home/ednilson/alunos.txt");

        try{
            /*
             * Objeto scanner é instanciado para abrir um arquivo, ou seja,
             * não estamos usando o objeto para ler a entrada padrão (System.in),
             * mas para usar como STREAM (fluxo de bytes) o arquivo de texto
             * existente no sistema.
             */
            scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            /*
             * IOException pode ser lançada pelo construtor de Scanner()
             * quando um objeto File é passado como argumento, isso porque
             * o arquivo pode não existir.
             */
            System.err.println("Erro: " + e.getMessage());
        }finally {
            /*
             * Caso ocorra uma FALHA ao abrir o arquivo solicitado no
             * construtor de Scanner, o objeto não recebe uma referência,
             * e segue valendo nulo. Nesse caso, realizar um scanner.close()
             * geraria uma exceção. Assim, verificamos se scanner possui uma
             * referencia associada para depois fazer o close().
             */
            if(scanner != null){
                scanner.close();
            }
        }

    }
}
