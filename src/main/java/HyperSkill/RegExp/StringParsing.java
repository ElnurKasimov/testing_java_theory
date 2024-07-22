package HyperSkill.RegExp;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringParsing {

// The first line of the input contains a sequence of letters.
// The second line of the input contains some text.
// Your task is to determine if any of the words of this text start or end with the sequence specified
// in the first line of the input.
// If there is, you should output "YES", otherwise output "NO".
// A word can only contain symbols of the English alphabet.
// You should ignore the case while searching for matches.
//Sample Input:
//        ing
//        Java is the most popular programming language
// Sample Output:
//        YES
//
//Sample Input:
//        press
//        Regular expressions is hard to read, isn't it?
//Sample Output:
//        NO
//
//Sample Input:
//        ho
//        Wow! How awesome is that!
//Sample Output:
//        YES
//
//Sample Input:
//        ONE
//        ponep,onep!
//Sample Output:
//        YES



    // -----------------         Start or End of the word
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            String part = scanner.nextLine();
//            String line = scanner.nextLine();
//            String[] words = line.trim().split("[ ,?!]+");
//            System.out.println("words = " + Arrays.toString(words));
//            Pattern pattern = Pattern.compile("(?i)^(" + part + ".*|.*" + part + ")$");
//            boolean found = false;
//            for (String word : words) {
//                if(pattern.matcher(word).matches()) {
//                    found = true;
//                    break;
//                }
//            }
//            System.out.println(found ? "YES" : "NO");
//        }
//    }

    // -------------------       Middle of the word
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            String part = scanner.nextLine();
//            String line = scanner.nextLine();
//            String[] words = line.trim().split("[ ,?!]+");
//            System.out.println("words = " + Arrays.toString(words));
//            Pattern pattern = Pattern.compile("(?i).*\\B" + part + "\\B.*");
//            boolean found = false;
//            for (String word : words) {
//                if(pattern.matcher(word).matches()) {
//                    found = true;
//                    break;
//                }
//            }
//            System.out.println(found ? "YES" : "NO");
//        }
//    }

    // ---------------------      Any number
//    A number can be positive or negative. If it is negative, then it must start with a '-'.
//    If it is positive, it may start with a '+'.
//    If it doesn't start with either '+' or '-' it is considered positive.
//
//    A number representation can't be padded with leading zeroes.
//    For example, 001 is not a valid number (but 0 is).
//
//    A number can have a fractional part.
//    A delimiter between an integer part and a fractional part can be either a dot . or a comma ,.
//    A fractional part can't be padded with trailing zeros:
//    for example, 1.01 and 1.0 are valid numbers, but 1.00 and 1.10 are not.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String regex = "^([+-]?(0|[1-9]\\d*))(?:[.,](\\d*[1-9]|\\d))?$";
//
//        String number = scanner.nextLine();
//        System.out.println(number.matches(regex) ? "YES" : "NO");
//    }


    // -------------------       Contains word with certain number of characters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            String line = scanner.nextLine();
            String[] words = line.trim().split("\\W+");
            System.out.println("words = " + Arrays.toString(words));
            Pattern pattern = Pattern.compile("[a-zA-Z]{" + size + "}");
            boolean found = false;
            for (String word : words) {
                if(pattern.matcher(word).matches()) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }

}
