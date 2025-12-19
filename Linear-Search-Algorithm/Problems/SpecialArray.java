import java.util.Arrays;

public class SpecialArray {

    public static void main(String[] args) {

        // Test cases
        int[] nums1 = {3, 5};
        int[] nums2 = {0, 0};
        int[] nums3 = {0, 4, 3, 0, 4};

        System.out.println(specialArray(nums1)); // Output: 2
        System.out.println(specialArray(nums2)); // Output: -1
        System.out.println(specialArray(nums3)); // Output: 3
    }

    public static int specialArray(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        // Step 2: Try possible values of x
        for (int i = 0; i < n; i++) {

            int x = n - i; // numbers >= x

            // Check condition
            if (nums[i] >= x && (i == 0 || nums[i - 1] < x)) {
                return x;
            }
        }

        // Step 3: No valid x found
        return -1;
    }
}
