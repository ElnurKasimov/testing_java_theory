package HackerRank.BigInteger;

import java.io.*;
import java.math.*;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger num = new BigInteger(n);
        boolean isPrime = true;
//        if (num != 1) {
//            for (int i = 2; i < Math.sqrt(num); i++) {
//                if (num%i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        } else {
//            isPrime = false;
//        }
        if (num.compareTo(BigInteger.ONE) == 1) {
            isPrime = false;
        }

        System.out.println(num.isProbablePrime(1) ? "prime" : "not prime");
    }
}
