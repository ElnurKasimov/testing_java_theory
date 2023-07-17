package SoftServe.Sprint6.Quiz3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,  Month.NOVEMBER, 8);
        date.plusYears(2).plusMonths(3).plusDays(4);
        System.out.println("date = " + date);
    }
}
