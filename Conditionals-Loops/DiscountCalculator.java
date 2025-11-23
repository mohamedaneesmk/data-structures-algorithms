import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        
        double finalPrice = calculateFinalPrice(price, discount);
        System.out.println("Discount Amount: " + (price - finalPrice));
        System.out.println("Final Price: " + finalPrice);
        sc.close();
    }
    
    // O(1) time complexity
    public static double calculateFinalPrice(double price, double discount) {
        return price - (price * discount / 100);
    }
}