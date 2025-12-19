import java.util.HashSet;
import java.util.Set;

public class CheckDoubleExists {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        System.out.println(findDoubleExits(arr));
    }

    private static boolean findDoubleExits(int[] arr) {
        // Optimized Approach
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2)))
                return true;
            set.add(num);
        }
        return false;
    }
}