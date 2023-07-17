package SoftServe.Sprint6.Quiz10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        IntStream intStream = IntStream.range(0, 0);
        intStream.forEach(System.out::print);
        Stream.of(2,3,0,1)
                .map(num -> IntStream.range(0,num))
                .forEach(stream -> stream.forEach(System.out::print));

    }
}
