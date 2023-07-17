package SoftServe.Sprint6.Quiz15;

import java.io.IOException;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        System.out.println(
                Stream.generate(() -> random.nextInt(7))
                        .limit(4)
                        .max(Comparator.naturalOrder())
                        .orElse(6));
    }
}
