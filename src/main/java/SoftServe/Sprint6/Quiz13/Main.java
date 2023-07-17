package SoftServe.Sprint6.Quiz13;

import java.io.IOException;
import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream.of(Stream.of(1,2,3,4,5)
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .reduce(0, (acc,x) -> acc +x),0)
                .forEach(System.out::print);
    }
}
