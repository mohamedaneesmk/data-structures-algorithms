/*import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
        scanner.close();
    }
}
*/ 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = factorial(number);

        System.out.println(result);
        scanner.close();
    }

    // Recursive method
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base condition
        }
        return n * factorial(n - 1); // Recursive call
    }
}
