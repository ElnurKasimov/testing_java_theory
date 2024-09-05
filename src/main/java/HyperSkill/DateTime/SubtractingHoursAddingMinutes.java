package HyperSkill.DateTime;

import java.time.*;
import java.util.Scanner;

public class SubtractingHoursAddingMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        LocalDateTime date = LocalDateTime.parse(dateStr);
        String changes = sc.nextLine();
        String[] hoursMinutes = changes.trim().split(" ");
        LocalDateTime newDate = date.minusHours(Long.parseLong(hoursMinutes[0])).plusMinutes(Long.parseLong(hoursMinutes[1]));
        System.out.println(newDate);
    }
}
