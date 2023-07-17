package SoftServe.Sprint6.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

public class MyUtils {
    public static void main(String[] args) {
        java.util.List<String> myList = new java.util.ArrayList<>();
        Map<String, List<String>> map = Map.of(
                "key1", Arrays.asList("vAlue1 ", " value2"),
                "key2", Arrays.asList("value3", "value1 "),
                "key3", Arrays.asList("Value5", "value6")
        );

        Stream<String> streamOfLists = map.values().stream().
                flatMap(List::stream)
                .filter(str -> !(str.equals("") || str == null) )
                .map(String::toLowerCase)
                .map(String::trim)
                .distinct()
                .sorted();
        streamOfLists.forEach(System.out::print);
    }

}
