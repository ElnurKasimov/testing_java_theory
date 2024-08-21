package HyperSkill.StreamAPI;

import java.util.Scanner;
import java.util.stream.*;

class Factorial {

    /**
     * Calculates the factorial of the given number n
     *
     * @param n >= 0
     *
     * @return factorial value
     */
    public static long factorial(long n) {
        return LongStream.rangeClosed(1,n).reduce(1,(a,b) -> a*b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine().trim());

        System.out.println(factorial(n));
    }
}
