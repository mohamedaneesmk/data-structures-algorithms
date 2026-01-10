public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 29, 10, 14, 37, 13 };
        selectionSort(nums);

        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    private static void selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            // Optional: Print after each pass to see progress
            // System.out.println("After pass " + (i + 1) + ": " +
            //        java.util.Arrays.toString(nums));
        }
    }
}
