package DoraAventureira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nome = "Dora";
        Endereco endereco = new Endereco("Araraquara", "Brasil");
        List<String> mochila = new ArrayList<>(2);
        mochila.add("mapa");
        mochila.add("binóculos");

        var dora = new Aventureira(nome, endereco, mochila);

        System.out.println(dora.getNome());
        System.out.println(dora.getEndereco().getCidade());
        System.out.println(dora.getEndereco().getPais());
        System.out.println(dora.getMochila());

        endereco = dora.getEndereco();
        endereco.setCidade("Ibaté");
        endereco.setPais("Inglaterra");
        mochila = dora.getMochila();
        mochila.clear();
        mochila.add("pau de macarrão");
        mochila.add("Beer");
        System.out.println("\nDados hackeados --->");
        System.out.println(dora.getNome());
        System.out.println(dora.getEndereco().getCidade());
        System.out.println(dora.getEndereco().getPais());
        System.out.println(dora.getMochila());
    }
}
//    public static void main(String[] args) {
//        String nome = "Dora";
//        Endereco endereco = new Endereco("Araraquara", "Brasil");
//        var dora = new Aventureira(nome, endereco, Collections.emptyList());
//
//        System.out.println(dora.getNome());
//
//        var raposo = new Raposo(nome, endereco, Collections.emptyList());
//        dora = raposo;
//        System.out.println(dora.getNome());
//        raposo.setNomeHackeado("Sr. Raposo!");
//        System.out.println(dora.getNome());
//    }

