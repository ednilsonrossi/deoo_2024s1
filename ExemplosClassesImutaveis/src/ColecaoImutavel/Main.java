package ColecaoImutavel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Maçã");
        mutableList.add("Banana");
        mutableList.add("Laranja");

        // Criando uma lista imutável a partir da lista mutável
        List<String> immutableList = Collections.unmodifiableList(mutableList);

        // Tentativa de modificar a lista imutável (resultará em UnsupportedOperationException)
        try {
            immutableList.add("Pera"); // Tentativa de adicionar um elemento à lista imutável
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: Tentativa de modificar a lista imutável falhou.");
        }

        // Iteração sobre a lista imutável
        System.out.println("Lista imutável:");
        for (String fruit : immutableList) {
            System.out.println(fruit);
        }
    }
}
