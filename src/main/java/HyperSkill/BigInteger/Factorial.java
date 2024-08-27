package HyperSkill.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        BigInteger input = new BigInteger(inputLine);
        long l = 0;
        BigInteger factorial = BigInteger.ONE;
        boolean lessThanInput = true;
        while (lessThanInput) {
            l++;
            factorial = factorial.multiply(BigInteger.valueOf(l));
            if(factorial.compareTo(input) >= 0) {
                lessThanInput = false;
            }
        }
        System.out.println(l);
    }
}
