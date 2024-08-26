package HyperSkill.Patterns.SimpleFactory;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time result = new Time();
        result.hour = 12;
        result.minute = 0;
        result.second = 0;
        return result;
    }

    public static Time midnight() {
        Time result = new Time();
        result.hour = 0;
        result.minute = 0;
        result.second = 0;
        return result;
    }

    public static Time ofSeconds(long seconds) {
        long withoutDays = seconds%216000;
        int hour = (int) withoutDays / 3600;
        int minute = (int) withoutDays%3600 / 60;
        int second = (int) withoutDays - minute*60 - hour*3600;
        Time result = new Time();
        result.hour = hour;
        result.minute = minute;
        result.second = second;
        return result;
    }

    public static Time of(int hour, int minute, int second) {
        Time result = new Time();
        result.hour = hour;
        result.minute = minute;
        result.second = second;
        return result;
    }
}

public class TimeFactory {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}
