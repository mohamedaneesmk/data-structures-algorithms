// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello "+userName);
        scanner.close();
    }
}
