public class Main {
    public static void main(String[] args) {

        Pessoa p = Pessoa.getInstance();

        p.setNome("Roberts");
        System.out.println(p.getNome());

        Pessoa roberts = Pessoa.getInstance();
        System.out.println(roberts.getNome());

    }
}
