package SoftServe.Sprint5.Test1;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyUtils {
    public static int getCount( int[] array, Predicate<Integer> condition) {
        int count = 0;
        for(int number : array) {
            if (condition.test(number))count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = MyUtils.getCount(new int[]{1, 2, 3, 4, 5, 6, 7}, x->x%2==0);
        System.out.println("result = " + result);
    }
}
