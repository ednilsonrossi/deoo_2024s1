public class Pessoa {

    private static Pessoa instance;

    private String nome;

    private Pessoa(){}

    public static Pessoa getInstance(){
        if(instance == null){
            instance = new Pessoa();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
