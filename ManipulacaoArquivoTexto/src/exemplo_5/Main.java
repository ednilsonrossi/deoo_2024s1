package exemplo_5;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "/home/ednilson/livros.bin";
        Livro livro = new Livro(
                "C Programming Absolute Beginner's Guide",
                "Greg Perry, Dean Miller",
                "3rd",
                2014,
                30.00);

        try {
            LivroUtil.gravarLivros(caminho, livro);
        }catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        }

        Livro livroRecuperado = null;
        try{
            livroRecuperado = (Livro) LivroUtil.recuperarLivros(caminho);
        } catch (IOException e) {
            System.err.println("Erro ao manipular arquivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Erro na conversão de dados: " + e.getMessage());
        }

        System.out.println("Livro Recuperado: \n" + livroRecuperado);

        List<Livro> livroList = loadData();
        caminho = "/home/ednilson/dataset.bin";
        try{
            LivroUtil.gravarLivros(caminho, livroList);
        }catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        }

        List<Livro> listaRecuperada = null;
        try {
            listaRecuperada = (List<Livro>) LivroUtil.recuperarLivros(caminho);
        }catch (Exception e){
            System.err.println("Erro: " + e.getMessage());
        }
        System.out.println("--- RECUPERADOS ---");
        for(Livro l : listaRecuperada){
            System.out.println(l);
        }
    }

    public static List<Livro> loadData(){
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Java: Como Programar", "Paul Deitel", "11ª", 2017, 150.00));
        livros.add(new Livro("Head First Java", "Kathy Sierra, Bert Bates", "2ª", 2005, 100.00));
        livros.add(new Livro("Effective Java", "Joshua Bloch", "3ª", 2018, 120.00));
        livros.add(new Livro("Java Concurrency in Practice", "Brian Goetz", "1ª", 2006, 130.00));
        livros.add(new Livro("Thinking in Java", "Bruce Eckel", "4ª", 2006, 110.00));
        livros.add(new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "1ª", 2008, 140.00));
        livros.add(new Livro("Java: The Complete Reference", "Herbert Schildt", "10ª", 2017, 125.00));
        livros.add(new Livro("Java Performance: The Definitive Guide", "Scott Oaks", "1ª", 2014, 135.00));
        livros.add(new Livro("Java 8 in Action", "Raoul-Gabriel Urma, Mario Fusco, Alan Mycroft", "1ª", 2014, 145.00));
        livros.add(new Livro("Java Design Patterns: A Hands-On Experience with Real-World Examples", "Vaskaran Sarcar", "1ª", 2019, 155.00));
        return livros;
    }
}
