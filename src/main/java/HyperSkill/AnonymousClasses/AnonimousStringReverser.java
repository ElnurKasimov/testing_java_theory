package HyperSkill.AnonymousClasses;

import java.util.Scanner;
import java.util.stream.Stream;

public class AnonimousStringReverser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < str.length() ; i++) {
                    stringBuilder.append(str.charAt(str.length() - 1 - i));
                }
                return stringBuilder.toString();
            }
        };
        System.out.println(reverser.reverse(line));
    }

}
