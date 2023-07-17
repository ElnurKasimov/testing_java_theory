package SoftServe.Sprint6.Quiz11;

import java.io.IOException;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        IntStream intStream = IntStream.range(0, 0);
        intStream.forEach(System.out::print);
        DoubleStream.of((int) 0,1)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::print);

    }
}
