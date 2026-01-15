import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result); // Output: [5, 6]
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Mark seen numbers by negating at their index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the index corresponding to the number
            if (nums[index] > 0) { // Only negate if it's positive
                nums[index] = -nums[index]; // Mark as seen by negating
            }
        }

        // Step 2: Collect indices that remain positive → missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }
        return missingNumbers;
    }
}
