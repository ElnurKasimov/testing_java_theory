package HackerRank.OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubArraySum {

    public static int sumSubArrayElements(int[] subarray) {
        int sum = 0;
        for (int number : subarray) {
            sum+=number;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = sc.nextLine();
        String line = sc.nextLine();
        String[] strings = line.trim().split(" ");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int[]subArray = Arrays.copyOfRange(numbers,i,j+1);
                if(sumSubArrayElements(subArray) < 0) {
                    result++;
                    System.out.println(Arrays.toString(subArray));
                }
            }
        }
        System.out.println(result);
    }
}
