package HackerRank.TwoDimensionArrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//      Given a  2D Array,
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//      We define an hourglass in  to be a subset of values with indices falling in this pattern
//      in its graphical representation:
//        a b c
//          d
//        e f g
//      There are hourglasses in , and an hourglass sum is the sum of an hourglass' values.
//      Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
//      Constraints
//       -9 <= A[i][j] <= 9
//        0 <= i,j <= 5
//

public class HourGlasses {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();
        int result = -63;
        int sum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if(sum > result) {
                    result = sum;
                }
            }
        }
        System.out.println(result);
    }
}
