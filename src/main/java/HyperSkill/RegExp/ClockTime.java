package HyperSkill.RegExp;

import java.util.Scanner;

//  For a given string you should check whether it shows time in the correct format.
//  The string should consist of two integers separated by the colon.
//  The first integer should be from 00 to 23 and the second integer should be from 00 to 59.
//  Note that if only one digit in the integer, it should be padded with a leading zero.
//  That is, strings "5:00" and "05:1" don't show time correctly, but "05:00" and "05:01" do.
//  Output "YES" if the given string shows time in the correct format, otherwise output "NO".
public class ClockTime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String date = scn.nextLine();
            String dateRegex =
             "(0[0-9]|1[0-9]|2[0123]):(0[0-9]|[0-5][0-9])";
            System.out.println(date.matches(dateRegex) ? "YES" : "NO");
        }
    }
    
}
