package SoftServe.Sprint10;

import SoftServe.Sprint5.Test1.MyUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesFromList {
    public static void main(String[] args) {



        List<String> tasks = List.of("one", "two", "three", "one", "three");
        Map<String, Long> duplicatesMap = tasks.stream()
                .collect(Collectors.groupingBy(task -> task, Collectors.counting()));
        System.out.println(duplicatesMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));
    }

}
