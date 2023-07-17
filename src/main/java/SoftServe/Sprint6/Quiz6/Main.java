package SoftServe.Sprint6.Quiz6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "abc";
       byte[] data = text.getBytes();
        OutputStream outputStream = new FileOutputStream("D:/data.txt");
        for (int i = 0; i <3 ; i++) {
            outputStream.write(data);
        }
        outputStream.close();
    }
}
