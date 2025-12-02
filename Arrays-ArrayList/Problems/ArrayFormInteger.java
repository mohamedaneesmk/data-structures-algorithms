package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] digits = { 2, 1, 5 };
        int k = 806;

        List<Integer> result = addToArrayForm(digits, k);
        System.out.println(result);
    }

    private static List<Integer> addToArrayForm(int[] digits, int k) {
        List<Integer> result = new ArrayList<>();
        int i = digits.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += digits[i];
                i--;
            }

            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
