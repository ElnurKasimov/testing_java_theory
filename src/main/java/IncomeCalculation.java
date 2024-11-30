import java.util.Locale;
import java.util.Scanner;

public class IncomeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Input quantity trades per week : ");
        int trades = sc.nextInt();
        System.out.print("Input stop loss in percent of capital : ");
        double stopLoss = sc.nextDouble();
        System.out.print("Input takeProfit in percent of capital : ");
        double takeProfit = sc.nextDouble();
        System.out.print("Input percentage of successful trades : ");
        int successfulTrades = sc.nextInt();
        System.out.print("Input initial capital in dollars : ");
        double initialCapital = sc.nextDouble();
        System.out.print("Input period in weeks : ");
        int weeks = sc.nextInt();
        System.out.print("Input ratio of increasing capital per 2 weeks : ");
        double increase = sc.nextDouble();
        // Расчет капитала с учетом увеличения
        double totalCapital = initialCapital * Math.pow(increase, weeks / 2.0);
        System.out.printf("Your capital in %d weeks will be %.2f\n", weeks, totalCapital);
        double incomes = 0.;
        double losses = 0.;
        double incomePerTrade = 0.;
        double lossPerTrade = 0.;
        double delta = 1.0;
        int week = 1;
        do {
            if (week > 2 && week % 2 == 1) {
                delta *= increase;
            }
            incomePerTrade = takeProfit * initialCapital * delta / 100;
            lossPerTrade = stopLoss * initialCapital * delta / 100;
//            System.out.printf("Week %d: delta = %.2f incomePerTrade = %.2f lossPerTrade = %.2f\n ",
//                    week, delta, incomePerTrade, lossPerTrade);
            incomes += trades * incomePerTrade * successfulTrades / 100.0;
            losses += trades * lossPerTrade * (100 - successfulTrades) / 100.0;

            week++;
        } while (week <= weeks);
        double income = incomes - losses;
        System.out.printf("Your income will be %.2f\n", income);
    }
}
