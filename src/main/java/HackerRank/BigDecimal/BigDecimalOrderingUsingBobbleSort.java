package HackerRank.BigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalOrderingUsingBobbleSort {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length - 1; i++) {
            BigDecimal bobble = new BigDecimal(s[0]);
            for (int j = 1; j < s.length - i; j++) {
                BigDecimal current = new BigDecimal(s[j]);
                if(current.compareTo(bobble) < 0) {
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                } else {
                    bobble = current;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }


}
