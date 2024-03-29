package DoraAventureira;

public class Endereco {
    private String cidade;
    private String pais;

    public Endereco(String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
