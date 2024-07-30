package HackerRank.RegExp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class GoogleAccount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> names = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];
            Pattern pat = Pattern.compile("[a-z.]+@gmail.com$");
            Matcher matcher = pat.matcher(emailID);
            if(matcher.matches()) {
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for (String string : names ) {
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
