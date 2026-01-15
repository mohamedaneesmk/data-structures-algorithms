import java.util.HashSet;
import java.util.Set;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1 };
        System.out.println(canMakeArithmeticProgression(arr));
    }

    private static boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 1 : find min and max
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Step 2: check if difference is valid
        if ((max - min) % (len - 1) != 0) {
            return false;
        }

        int diff = (max - min) / (len - 1);

        // Step 3: put all elements in a set
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Step 4: check if all terms exist
        for (int i = 0; i < len; i++) {
            int expected = min + i * diff;
            if (!set.contains(expected)) {
                return false;
            }
        }

        return true;
    }
}
