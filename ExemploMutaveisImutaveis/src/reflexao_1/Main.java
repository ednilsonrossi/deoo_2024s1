package reflexao_1;

public class Main {

    public static void main(String[] args) {

        var parte_1 = "Uma string";
        var parte_2 = "é imutável.";
        String str = String.format("%s %s", parte_1, parte_2);
        System.out.println(str);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(parte_1);
        strBuilder.append(" ");
        strBuilder.append(parte_2);
        strBuilder.append(" Mas StringBuilder é mutável");
        System.out.println(strBuilder);

        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(parte_1);
        strBuffer.append(" ");
        strBuffer.append(parte_2);
        strBuffer.append(" E como o StringBuilder, o StringBuffer também é mutável");
        System.out.println(strBuffer);
    }
}
