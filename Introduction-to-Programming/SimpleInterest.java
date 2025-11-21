// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        int principalAmount = scanner.nextInt();

        System.out.print("Enter Rate of Interest: ");
        float rateOfInterest = scanner.nextFloat();

        System.out.print("Enter Number of Years: ");
        int numberOfYears = scanner.nextInt();

        float interest = findSimpleInterest(principalAmount, rateOfInterest, numberOfYears);

        System.out.println("Simple Interest = " + interest);
        System.out.println("Total Amount = " + (principalAmount + interest));

        scanner.close();
    }

    private static float findSimpleInterest(int principalAmount, float rateOfInterest, int numberOfYears) {
        return (principalAmount * rateOfInterest * numberOfYears) / 100;
    }
}
