package HyperSkill.RegExp;

import java.util.Scanner;

//  Write a program that uses regular expressions to check whether the input card number
//  is valid and identifies the card network name.
//
//  The input must consist only of numbers.
//  Your program must take a string as an input and print the name of the card network as output,
//  choosing from the set of names specified below, or the message: "Card number does not exist”.
//  Card networks: Visa, Mastercard, American Express.
//  A Visa card starts with 4 and has the length of 16 digits.
//  A MasterCard starts with the numbers from 51 to 55, or a range of numbers starting from 2221 to 2720.
//    All have 16 digits.
//  American Express card numbers start with 34 or 37 and have 15 digits.
//

public class CardNameValidation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "4\\d{15}";
        String masterCardRegex = "(5[1-5]\\d{14}|(222[1-9]|22[3-9]\\d|2[3-6]\\d{2}|27[01]\\d|2720)\\d{12})";
        String americanExpressRegex = "3[47]\\d{13}";

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
    
}
