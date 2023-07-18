package SoftServe.Sprint6.Task7;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {

    public Stream<Integer> duplicateElements(Stream<Integer> stream) {
        List<Integer> elements = stream.filter(Objects::nonNull).toList();
//        Predicate<Integer> isPresent = v -> elements.stream().filter(e -> e.equals(v)).count() > 1;
//        return elements.stream().filter(isPresent);
        Function<Integer, Long> count = v -> elements.stream().filter(e -> e.equals(v)).count();
        Map<Integer, Long> map = elements.stream().collect(Collectors.toMap(
                k -> k,
                v -> 1L,
                Long::sum
        ));
        //         for(Map.Entry<Integer, Long> ent : map.entrySet()) {
//             System.out.println( ent.getKey() + ent.getValue());
//         }
        return map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey());
    }

    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        Stream<Integer> origin = Stream.of(4, 9, 0, 7, 5, 34, 9, 5, 0, 23, 3, 14, 5, 3, 14);
        myUtils.duplicateElements(origin).forEach(System.out::println);
    }
}