import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double perimeter = 2 * Math.PI * r;
        System.out.printf("Perimeter: %.2f", perimeter);
        sc.close();
    }
}
