package Optional;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<String> optional;

        optional = Optional.of("Hello, World!");
        optional = Optional.ofNullable(null);
        optional = Optional.empty();
    }
}
