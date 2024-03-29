package reflexao_1;

public class HelloWorld2 {

    public static void main(String[] args) {
        String str = "Hello, ";
        str = "World!";

        str = "Hello, ";
        str = str + " World!";

        str = "";
        str = str.concat("Hello, ");
        str = str.concat("World!");
    }
}
