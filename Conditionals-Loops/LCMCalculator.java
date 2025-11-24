import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("LCM: " + lcm(a, b));
        sc.close();
    }
    
    // Using GCD - O(log min(a,b)) time
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}