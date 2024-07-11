package HackerRank.BinaryNumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


// Given a base-10 integer, convert it to binary (base-2).
// Then find and print the base-2 integer denoting the maximum number of consecutive 1's
// in binary representation.
// When working with different bases, it is common to show the base as a subscript.

public class CosecutiveOnes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k < 4; k++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String binary = Integer.toBinaryString(n);
            System.out.println("binary = " + binary);
            String[] ones = binary.split("0");
            System.out.println(Arrays.toString(ones));
            int result = 0;
            if(ones.length> 0) {
                result = ones[0].length();
                for (int i = 1; i < ones.length; i++) {
                    if (ones[i].length() > result) {
                        result = ones[i].length();
                    }
                }
            }
            System.out.println("result = " + result);
        }
        bufferedReader.close();
    }
}
