package HyperSkill.RegExp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Suppose, you want to create a new programming language that supports variables.
//  There is a set of rules for identifiers (names) of variables:
//  It can include lower and upper letters, digits and the underscore character _;
//  It can only start with a letter or an underscore;
//  If an identifier starts with an underscore,
//  the second character should be either a letter or a digit, but not an underscore;
//  Note that a single _ is not a valid identifier.
//  Using the provided template, write a program that reads n identifiers
//  and then outputs all invalid ones in the same order as they appear in the input data.
//  We hope that you will use regexes to solve the problem.
public class IllegalIdentifiers {

    Scanner scanner = new Scanner(System.in);

    int numberOfVariables = Integer.parseInt(scanner.nextLine());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfVariables = Integer.parseInt(scanner.nextLine());
        String regex = "(_[a-zA-Z\\d]\\w*|[a-zA-Z]\\w*)";
        List<String> names = new ArrayList<>();
        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            names.add(identifier);
        }
        for (String identifier : names) {
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}
