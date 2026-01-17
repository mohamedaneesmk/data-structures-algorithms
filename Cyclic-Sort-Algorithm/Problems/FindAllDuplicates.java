import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = findDuplicates(nums);

        System.out.println(result);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Place each number at its correct position
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            // If number is not at correct position and position doesn't have duplicate
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find numbers not at their correct positions
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
