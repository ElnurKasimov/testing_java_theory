package HyperSkill.RegExp;

import java.util.Scanner;

//
//  Write a program that uses regular expressions to check whether the input date is valid.
//  The input date can be in any of the two formats: yyyy-mm-dd or dd-mm-yyyy.
//  The year must be 19yy or 20yy. - /. symbols can be used as splitters.
//  dd from 01 to 31
//  mm from 01 to 12
//  For a given string output Yes if this string is a valid date, otherwise output No.
public class DatePattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String date = scn.nextLine();
            String dateRegex =
             "(([1][9]|[2][0])\\d{2}[-/.](0[0-9]|1[0-2])[-/.](0[1-9]|[12][0-9]|3[01])|(0[1-9]|[12][0-9]|3[01])[-/.](0[0-9]|1[0-2])[-/.]([1][9]|[2][0])\\d{2})";
            System.out.println(date.matches(dateRegex) ? "Yes" : "No");
        }

    }
    
}
