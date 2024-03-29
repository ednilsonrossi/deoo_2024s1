package DoraAventureira;

import java.util.List;

//public class Raposo extends Aventureira{
public class Raposo{

    private String nomeHackeado;

    public Raposo(String nome, Endereco endereco, List<String> mochila) {
        //super(nome, endereco, mochila);
        this.nomeHackeado = nome;
    }

    public void setNomeHackeado(String nomeHackeado){
        this.nomeHackeado = nomeHackeado;
        System.out.println("Imutabilidade foi quebrada!");
    }

    public String getNome() {
        return nomeHackeado;
    }
}
