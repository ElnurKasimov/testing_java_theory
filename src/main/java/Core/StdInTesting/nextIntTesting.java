package Core.StdInTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class nextIntTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            numbers.add(sc.nextInt());
        }
//        System.out.println(numbers);
        int queries = sc.nextInt();
        while(queries > 0) {
            String temp = sc.nextLine();
            String request = sc.nextLine();
            if ("Insert".equals(request)) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                numbers.add(index, value);
            }
            if ("Delete".equals(request)) {
                int index = sc.nextInt();
                numbers.remove(index);
            }
            queries--;
        }
        sc.close();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
