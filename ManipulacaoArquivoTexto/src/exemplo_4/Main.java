package exemplo_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String caminho = "/home/ednilson/livros.csv";
        List<Livro> dataset = LivrosUtil.lerLivros(caminho);

        System.out.println("---- Livros Lidos ----");
        for(Livro livro : dataset){
            System.out.println(livro);
        }

        dataset.add(new Livro(
                "C Programming Absolute Beginner's Guide",
                "Greg Perry, Dean Miller",
                "3rd",
                2014,
                30.00)
        );

        dataset.add(new Livro(
                "The C Programming Language",
                "Brian W. Kernighan, Dennis M. Ritchie",
                "2nd",
                1988,
                40.00)
        );

        System.out.println("---- Livros Editados ----");
        for(Livro livro : dataset){
            System.out.println(livro);
        }

        LivrosUtil.gravarLivros(caminho, dataset);
    }
}
