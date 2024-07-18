package HyperSkill.RegExp;

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

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordStartOrEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String part = scanner.nextLine();
            String line = scanner.nextLine();
            String[] words = line.trim().split("[ ,?!]+");
            System.out.println("words = " + Arrays.toString(words));
            Pattern pattern = Pattern.compile("(?i)^(" + part + ".*|.*" + part + ")$");
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
