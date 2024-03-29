package reflexao_1;

public class HelloWorld3 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "Hello, World!";
        String str4 = new String("Hello, World!");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println(str1 == str3);
    }
}
