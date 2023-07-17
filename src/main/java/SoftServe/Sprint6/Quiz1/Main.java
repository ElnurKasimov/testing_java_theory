package SoftServe.Sprint6.Quiz1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar gc = GregorianCalendar.getInstance();
        gc.set(Calendar.YEAR, 2017);
        gc.set(Calendar.MONTH, 12);
        gc.set(Calendar.DAY_OF_MONTH, 8);
        System.out.print(gc.get(Calendar.DAY_OF_MONTH) + ".");
        System.out.print(gc.get(Calendar.MONTH) + ".");
        System.out.print(gc.get(Calendar.YEAR) + ".");
    }
}
