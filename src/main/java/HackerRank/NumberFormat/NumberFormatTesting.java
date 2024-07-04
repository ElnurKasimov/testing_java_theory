package HackerRank.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatTesting {

    public static void main(String[] args) {
        Object[] myNumbers = new Object[] {-2, 345.f,123.4567,0.49782e6, -123456.456789587d, 0b1010};
        NumberFormat nf = NumberFormat.getInstance();
        for (Object myNumber : myNumbers) {
            System.out.println(nf.format(myNumber) + "; ");
        }
        String mainString = nf.format(200.2345);
        System.out.println("mainString = " + mainString);
//        Locale indiaLocale = new Locale("en", "IN");
//        NumberFormat currency = NumberFormat.getCurrencyInstance(indiaLocale);
//        String india = currency.format(2345.9875);
//        System.out.println("india = " + india);

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }
}
