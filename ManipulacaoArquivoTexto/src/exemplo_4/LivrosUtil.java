package exemplo_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LivrosUtil {

    public static List<Livro> lerLivros(String caminho) throws NoSuchElementException {
        List<Livro> dataset = new ArrayList<>(10);
        File file = new File(caminho);

        try (var bufferedReader = new BufferedReader(new FileReader(file))){

            String line = bufferedReader.readLine(); //Leitura do cabeçalho

            line = bufferedReader.readLine();
            while (line != null && !line.isEmpty()){
                String[] fields = line.split(";");
                String titulo = fields[0];
                String autores = fields[1];
                String edicao = fields[2];
                int ano = Integer.parseInt(fields[3]);
                double valor = Double.parseDouble(fields[4]);

                dataset.add(new Livro(titulo, autores, edicao, ano, valor));

                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
            throw new NoSuchElementException("Arquivo não encontrado.");
        }

        return dataset;
    }


    public static void gravarLivros(String caminho, List<Livro> livros){
        File file = new File(caminho);
        try (var bufferedWriter = new BufferedWriter(new FileWriter(file))){

            bufferedWriter.write("Title;Author;Edition;Publication_Year;Value");
            bufferedWriter.newLine();

            for(Livro livro : livros){
                bufferedWriter.write(livro.getTitulo() + ";" +
                        livro.getAutores() + ";" +
                        livro.getEdicao() + ";" +
                        livro.getAnoPublicacao() + ";" +
                        livro.getValor()
                );
                bufferedWriter.newLine();
            }

        } catch (IOException e){
            System.err.println("Erro ao gravar csv: " + e.getMessage());
        }
    }

}
