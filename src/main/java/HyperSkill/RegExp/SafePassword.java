package HyperSkill.RegExp;

import java.util.Scanner;

//  The password is hard to crack if it contains at least one uppercase letter,
//  at least one lowercase letter, at least one digit and includes 12 or more symbols.
//  For a given string you should output "YES" if this password is hard to crack, otherwise output "NO".
//
//  Note that it's convenient to complete this task by using several separate regexes.
//

public class SafePassword {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String password = scn.nextLine();
            String regExp =
             "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d]).{12,}";
            System.out.println(password.matches(regExp) ? "YES" : "NO");
        }
    }
    
}
