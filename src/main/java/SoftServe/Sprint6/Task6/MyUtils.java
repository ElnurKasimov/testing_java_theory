package SoftServe.Sprint6.Task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyUtils {
//
//    public static Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
//        Map<String, Stream<String>> result = new HashMap<>();
//        List<Stream<String>> list1 = list.stream().toList();
//        List<Stream<String>> list2 = list.stream().toList();
//        List<Stream<String>> list3 = list.stream().toList();
//        Map<String, Stream<String>> mob = list1.stream()
//                .filter(stream -> stream != null)
//                .flatMap(stream->stream)
//                .map(str -> str.replaceAll("\\(", ""))
//                .map(str -> str.replaceAll("\\)", ""))
//                .map(str -> str.replaceAll("-", ""))
//                .map(str -> str.replaceAll("\\s", ""))
//                .filter(s -> s != null)
//                .filter(s -> !s.trim().isEmpty())
//                .sorted()
//                .distinct()
//                .filter(s -> s.length() == 10)
//                .collect(Collectors.toMap(
//                        (k) -> k.substring(0,3),
//                        (v) -> Stream.of(v.substring(3)), Stream::concat));
//
//        Map<String, Stream<String>> loc = list2.stream()
//                .filter(stream -> stream != null)
//                .flatMap(stream->stream)
//                .map(str -> str.replaceAll("\\(", ""))
//                .map(str -> str.replaceAll("\\)", ""))
//                .map(str -> str.replaceAll("-", ""))
//                .map(str -> str.replaceAll("\\s", ""))
//                .filter(s -> s != null)
//                .filter(s -> !s.trim().isEmpty())
//                .sorted()
//                .distinct()
//                .filter(s -> s.length() == 7)
//                .collect(Collectors.toMap(
//                        (k) -> "loc",
//                        (v) -> Stream.of(v), Stream::concat));
//
//        Map<String, Stream<String>> err = list3.stream()
//                .filter(stream -> stream != null)
//                .flatMap(stream->stream)
//                .map(str -> str.replaceAll("\\(", ""))
//                .map(str -> str.replaceAll("\\)", ""))
//                .map(str -> str.replaceAll("-", ""))
//                .map(str -> str.replaceAll("\\s", ""))
//                .filter(s -> s != null)
//                .filter(s -> !s.trim().isEmpty())
//                .sorted()
//                .distinct()
//                .filter(s -> s.length()!=7 && s.length()!=10)
//                .collect(Collectors.toMap(
//                        (k) -> "err",
//                        (v) -> Stream.of(v), Stream::concat));
//        result.putAll(mob);
//        result.putAll(loc);
//        result.putAll(err);
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        List<Stream<String>> given = List.of(
//                Stream.of("093 987 65 43", "(050)1234567", "12-345"),
//                Stream.of("0999999999"),
//                Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28"),
//                Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
//        for(Map.Entry entry : MyUtils.phoneNumbers(given).entrySet()) {
//            System.out.print(entry.getKey() + "  ");
//            Stream<String> str = (Stream) entry.getValue();
//            str.forEach(s -> System.out.print(" " + s + ","));
//            System.out.println();
//        }
////        MyUtils.phoneNumbers(given).forEach((key, value) -> {
////       System.out.println(key + " -> " + value.collect(Collectors.joining(", ")));
////        });
//    }
}