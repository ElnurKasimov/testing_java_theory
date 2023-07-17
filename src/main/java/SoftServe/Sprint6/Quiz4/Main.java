package SoftServe.Sprint6.Quiz4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2017,  11, 26, 15, 38);
       Period period = Period.ofYears(1).ofMonths(2).ofDays(3);
       dateTime = dateTime.minus(period);
        System.out.println("date = " + dateTime);
    }
}
