package SoftServe.Sprint6.Task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {

    public static Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
        Map<String, Stream<String>> result = new HashMap<>();
        List<String> err = list.stream()
                .filter(stream -> stream != null)
                .filter(stream -> stream.count() > 1)
                .flatMap(stream -> stream)
                .map(str -> str.replaceAll("\\(", ""))
                .map(str -> str.replaceAll("\\)", ""))
                .map(str -> str.replaceAll("-", ""))
                .map(str -> str.replaceAll("\\s", ""))
                .filter(s -> !s.trim().isEmpty())
                .distinct()
                .filter(s -> s.length() < 7)
                .sorted().toList();
        Map<String, Stream<String>> errMap = new HashMap<>();
        errMap.put("err",err.stream());

        List<String> loc = list.stream()
                .filter(stream -> stream != null)
                .filter(stream -> stream.count() > 1)
                .flatMap(stream -> stream)
                .map(str -> str.replaceAll("\\(", ""))
                .map(str -> str.replaceAll("\\)", ""))
                .map(str -> str.replaceAll("-", ""))
                .map(str -> str.replaceAll("\\s", ""))
                .filter(s -> !s.trim().isEmpty())
                .distinct()
                .filter(s -> s.length() == 7)
                .sorted().toList();
        Map<String, Stream<String>> locMap = new HashMap<>();
        locMap.put("loc",loc.stream());

        Map<String, Stream<String>> mobMap = list.stream()
                .filter(stream -> stream != null)
                .filter(stream -> stream.count() > 1)
                .flatMap(stream->stream)
                .map(str -> str.replaceAll("\\(", ""))
                .map(str -> str.replaceAll("\\)", ""))
                .map(str -> str.replaceAll("-", ""))
                .map(str -> str.replaceAll("\\s", ""))
                .filter(s -> !s.trim().isEmpty())
                .distinct()
                .filter(s -> s.length() > 7)
                .sorted()
                .collect(Collectors.groupingBy(
                        str -> str.substring(0,3),
                        Collectors.mapping(str -> str.substring(3), Collectors.toList() )
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                ));
        result.putAll(errMap);
        result.putAll(locMap);
        result.putAll(mobMap);
        return result;
    }

    public static void main(String[] args) {
        List<Stream<String>> given = List.of(
                Stream.of("093 987 65 43", "(050)1234567", "12-345"),
                Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28"),
                Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
        System.out.println(MyUtils.phoneNumbers(given));
    }

}