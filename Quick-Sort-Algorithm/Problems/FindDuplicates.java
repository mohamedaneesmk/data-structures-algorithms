public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int duplicate = findDuplicates(nums);

        System.out.println(duplicate);
    }

    private static int findDuplicates(int[] nums) {
        // Floyd's Cycle Detection (Optimal - O(1) space)
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
}
