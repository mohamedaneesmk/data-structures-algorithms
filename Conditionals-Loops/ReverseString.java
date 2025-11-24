import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Reversed: " + reverseString(str));
        sc.close();
    }
    
    // Method 1: Using StringBuilder - O(n) time, most efficient
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    // Method 2: Two-pointer approach - O(n) time
    public static String reverseManual(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
} 
