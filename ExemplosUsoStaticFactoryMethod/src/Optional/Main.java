package Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional;

        optional = Optional.of("Hello, World!");
        System.out.println("Valor presente: " + optional.get());

        //optional = Optional.of(null); // Aqui ocorre exception
        System.out.println("Valor presente: " + optional.get());

        Optional<String> optionalNull;

        optionalNull = Optional.ofNullable("Hello, World!");
        System.out.println("Valor presente: " + optionalNull.orElse("Sem valor"));

        optionalNull = Optional.ofNullable(null);
        System.out.println("Valor presente: " + optionalNull.orElse("Sem valor"));
    }
}
