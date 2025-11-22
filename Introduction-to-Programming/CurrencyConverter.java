// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter amount in INR: ");
        float inr = scanner.nextFloat();

        float usdRate = 0.012f;  // Example conversion rate (1 INR = 0.012 USD)
        float usd = inr * usdRate;

        System.out.println("Amount in USD = " + usd);

        scanner.close();
    }
}
