public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        // Choose which solution to run
        int duplicate = findDuplicateBinarySearch(nums);
        // int duplicate = findDuplicateFloyd(nums);
        // int duplicate = findDuplicateIndexMarking(nums.clone());
        // int duplicate = findDuplicateXOR(nums);

        System.out.println("Duplicate number: " + duplicate);
    }

    // ---------------------------------------------------
    // ✅ Solution 1: Floyd's Cycle Detection (Best)
    // Time: O(n), Space: O(1)
    // ---------------------------------------------------
    private static int findDuplicateFloyd(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // ---------------------------------------------------
    // ✅ Solution 2: Index Marking (Modifies array)
    // Time: O(n), Space: O(1)
    // ---------------------------------------------------
    private static int findDuplicateIndexMarking(int[] nums) {
        for (int num : nums) {
            int index = Math.abs(num);

            if (nums[index] < 0) {
                return index;
            }

            nums[index] = -nums[index];
        }
        return -1;
    }

    // ---------------------------------------------------
    // ✅ Solution 3: Binary Search on Answer
    // Time: O(n log n), Space: O(1)
    // ---------------------------------------------------
    private static int findDuplicateBinarySearch(int[] nums) {
        int left = 1;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // ---------------------------------------------------
    // ✅ Solution 4: XOR Method (Works only if duplicate appears exactly twice)
    // Time: O(n), Space: O(1)
    // ---------------------------------------------------
    private static int findDuplicateXOR(int[] nums) {
        int xor = 0;
        int n = nums.length - 1;

        for (int num : nums) {
            xor ^= num;
        }

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        return xor;
    }
}
