package HyperSkill.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Deposit {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String startAmountString = sc.nextLine();
         String rateString = sc.nextLine();
         String yearsString = sc.nextLine();
         BigDecimal startAmount = new BigDecimal(startAmountString);
         BigDecimal rate = new BigDecimal(rateString);
         BigDecimal years = new BigDecimal(yearsString);
         BigDecimal increasing = rate.divide(BigDecimal.valueOf(100)).add(BigDecimal.ONE).pow(years.intValue());
         BigDecimal result = startAmount.multiply(increasing).setScale(2, RoundingMode.CEILING);
         System.out.printf("Amount of money in the account: %s",result.toString());
     }

}
