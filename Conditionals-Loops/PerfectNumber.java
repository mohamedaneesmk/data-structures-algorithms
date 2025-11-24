import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
    
    // Optimized - O(√n) time complexity
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        
        int sum = 1; // 1 is always a divisor
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        
        return sum == num;
    }
}