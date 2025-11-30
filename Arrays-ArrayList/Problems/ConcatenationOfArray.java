package Problems;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        printConcatenationOfArray(nums);
    }

    private static void printConcatenationOfArray(int[] nums) {
        int[] result = new int[nums.length * 2]; 

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result[nums.length + i] = nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
