package HackerRank.List;


//You are given n lines. In each line there are zero or more integers.
// You need to answer a few queries where you need to tell
// the number located in y-th position of x-th line.
//
// Take your input from System.in.
//
// Input Format
// The first line has an integer n. In each of the next n lines there will be an integer d
// denoting number of integers on that line and then there will be d space-separated integers.
// In the next line there will be an integer  denoting number of queries.
// Each query will consist of two integers x and y.
//
// Output Format
// In each line, output the number located in y-th position of x-th line.
// If there is no such position, just print "ERROR!"

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String temp = scanner.nextLine();
        List<List<Integer>> numbers  = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] elements = line.trim().split(" ");
            List<Integer> lineList = new ArrayList<>();
            if(Integer.parseInt(elements[0]) == 0) {
                numbers.add(lineList);
            } else {
                for (int j = 1; j < elements.length; j++) {
                    lineList.add(Integer.parseInt(elements[j]));
                }
                numbers.add(lineList);
            }
        }
        int q = scanner.nextInt();
        temp = scanner.nextLine();
        List<List<Integer>> queries  = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            String line = scanner.nextLine();
            String[] elements = line.trim().split(" ");
            List<Integer> lineList = new ArrayList<>();
            lineList.add(Integer.parseInt(elements[0]));
            lineList.add(Integer.parseInt(elements[1]));
            queries.add(lineList);
        }
        scanner.close();
        for (int i = 0; i < queries.size(); i++) {
            int queryHeight = queries.get(i).get(0) - 1;
            int queryLength = queries.get(i).get(1) - 1;
            if ( queryHeight < numbers.size() && queryLength < numbers.get(queryHeight).size() ) {
                System.out.println(numbers.get(queryHeight).get(queryLength));
            } else {
                System.out.println("ERROR!");
            }
        }
    }


}
