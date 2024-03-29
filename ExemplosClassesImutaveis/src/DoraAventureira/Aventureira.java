package DoraAventureira;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Aventureira {
    private final String nome;
    private final Endereco endereco;
    private final List<String> mochila;

    public Aventureira(String nome, Endereco endereco, List<String> mochila) {
        this.nome = nome;
        this.endereco = new Endereco(endereco.getCidade(), endereco.getPais());
        this.mochila = new LinkedList<>(mochila);
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return new Endereco(endereco.getCidade(), endereco.getPais());
    }

    public List<String> getMochila() {
        return new ArrayList<>(mochila);
    }
}
