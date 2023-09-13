import java.util.*;
import java.text.*;

public class Currencyformat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);


        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaCurrencyFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        NumberFormat chinaCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        String usFormattedAmount = usCurrencyFormat.format(payment);


        String indiaFormattedAmount = indiaCurrencyFormat.format(payment);
        String chinaFormattedAmount = chinaCurrencyFormat.format(payment);
        String franceFormattedAmount = franceCurrencyFormat.format(payment);

        System.out.println("US: " + usFormattedAmount);
        System.out.println("India: " + indiaFormattedAmount);
        System.out.println("China: " + chinaFormattedAmount);
        System.out.println("France: " + franceFormattedAmount);
    }
}
