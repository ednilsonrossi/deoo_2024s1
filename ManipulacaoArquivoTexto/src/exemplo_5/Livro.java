package exemplo_5;

import java.io.Serializable;

public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    private String titulo;
    private String autores;
    private String edicao;
    private int anoPublicacao;
    private Double valor;

    public Livro(String titulo, String autores, String edicao, int anoPublicacao, Double valor) {
        this.titulo = titulo;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", edicao='" + edicao + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", valor=" + valor +
                '}';
    }
}
