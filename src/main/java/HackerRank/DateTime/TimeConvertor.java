package HackerRank.DateTime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
//   Solution with DateTime class
//        DateTimeFormatter formatterAmPm = DateTimeFormatter.ofPattern("hh:mm:ssa");
//        LocalTime time = LocalTime.parse(s,formatterAmPm);
//        DateTimeFormatter formatterStandard = DateTimeFormatter.ofPattern("HH:mm:ss");
//        return time.format(formatterStandard);

//   Solution without Date and Time
        String period = s.substring(8, 10);
        String time = s.substring(0, 8);
        int hour = Integer.parseInt(time.substring(0, 2));
        String minutesSeconds = time.substring(2);
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0; // 12 AM is 00:00 in 24-hour format
            }
        } else {
            if (hour != 12) {
                hour += 12; // PM times other than 12 PM
            }
        }
        String hourString = String.format("%02d", hour);
        return hourString + minutesSeconds;
    }

}

public class TimeConvertor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}