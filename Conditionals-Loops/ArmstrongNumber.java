import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
    
    // O(d) where d is number of digits
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10; 
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == original;
    }
}