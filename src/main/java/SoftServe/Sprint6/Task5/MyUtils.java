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
                "key1", Arrays.asList(" ", ""),
                "key2", Arrays.asList("             ", "   "),
                "key3", Arrays.asList(null, "")
        );

        Stream<String> streamOfLists = map.values().stream()
                .flatMap(List::stream)
                .filter(str -> str != null)
                .filter(str -> !(str.equals("")))
                .map(str -> str.toLowerCase().replaceAll("\\s", ""))
                .map(str -> str.substring(0,1).toUpperCase()+str.substring(1))
                .distinct()
                .sorted();
        streamOfLists.forEach(System.out::println);
    }

}
