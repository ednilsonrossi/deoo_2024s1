package ExemploStringBuilder;

public class Main {
    public static void main(String[] args) {
        String theBegin = new StringBuilder()
                .append("Hell")
                .append("o, W")
                .append("orld!")
                .toString();

        System.out.println(theBegin);
    }
    //https://nathabonfim59.com/2019/04/15/voce-sabe-de-onde-surgiu-a-tradicao-do-hello-world/
}
