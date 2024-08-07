package HackerRank.BigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumAndMultiply {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        System.out.println(numA.add(numB));
        System.out.println(numA.multiply(numB));
    }
}
