package HyperSkill.RegExp;

import java.util.Scanner;

//  An IP address consists of four numbers from 0 to 255, inclusive, divided by the dots.
//  For example, 127.0.0.1 is a valid IP address, but 256.0.0.1 and 127.0.1 are invalid IP addresses.
//
//  For a given string output "YES" if this string is a valid IP address, otherwise output "NO".
//

public class CheckIPAddress {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String password = scn.nextLine();
            String regExp =
             "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
              "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
              "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
              "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
            System.out.println(password.matches(regExp) ? "YES" : "NO");
        }
    }
    
}
