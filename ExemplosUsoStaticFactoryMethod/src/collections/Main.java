package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Collections.emptyList();
        Set<String> stringSet = Collections.emptySet();
        Map<String, String> stringMap = Collections.emptyMap();

        List<Integer> integers = List.of(0, 2, 4, 6, 8);

        List<Double> doubles = Collections.singletonList(3.0);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17);
    }
}
