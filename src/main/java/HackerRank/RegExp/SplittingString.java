package HackerRank.RegExp;

import java.util.Scanner;

public class SplittingString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String trimmed = s.trim();
        if (!trimmed.isEmpty()) {
            String[] strings = s.trim().split("[^a-zA-Z]+");
            System.out.println(strings.length);
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        } else {
            System.out.println("0");
        }
    }
}
