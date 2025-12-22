import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 8, 8, 8, 10 };
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {
        return new int[] { findFirst(nums, target), findLast(nums, target) };
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                index = mid;
                right = mid - 1;
            } else if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return index;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                index = mid;
                left = mid + 1;
            } else if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return index;
    }
}
