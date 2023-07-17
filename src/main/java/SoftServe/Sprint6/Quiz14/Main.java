package SoftServe.Sprint6.Quiz14;

import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Stream.of(3,2,1)
                .peek(x -> System.out.print(x))
                .reduce((acc,x) -> acc +x)
                        .orElse(0));
    }
}
