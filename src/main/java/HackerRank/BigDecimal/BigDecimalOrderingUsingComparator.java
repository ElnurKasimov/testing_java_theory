package HackerRank.BigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalOrderingUsingComparator {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        List<String> strings = new ArrayList<>(Arrays.asList(s));
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                int result = bd1.compareTo(bd2);
                if (result != 0) {
                    return result;
                } else {
                    return Integer.compare(strings.indexOf(s1), strings.indexOf(s2));
                }
            }
        });
        for (String string : strings) {
            System.out.println(string);
        }
    }

//    without Comparator it's possible to resolve the issue using Bobble Sort algorithm
//
//    System.out.println(Arrays.toString(s));
//        List<BigDecimal> bigDecimals = new ArrayList<>();
//        bigDecimals.add(new BigDecimal(s[0]));
//        BigDecimal second = new BigDecimal(s[1]);
//        if(bigDecimals.get(0).compareTo(second) > 0) {
//            bigDecimals.add(0,second);
//        } else {
//            bigDecimals.add(second);
//        }
//        if (s.length > 2) {
//            for (int i = 2; i < s.length; i++) {
//                BigDecimal current = new BigDecimal(s[i]);
//                for (int j = 1; j < bigDecimals.size(); j++) {
//                    if(bigDecimals.get(j-1).compareTo(current) <= 0 &&
//                            bigDecimals.get(j).compareTo(current) > 0) {
//                        bigDecimals.add(j,current);
//                        break;
//                    }
//                }
//
//                System.out.println(bigDecimals.toString());
//            }
//        }
//        System.out.println(bigDecimals.toString());
//    }
}
