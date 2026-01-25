import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 1, 3};

        mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;      // pointer for left half
        int j = mid + 1;   // pointer for right half
        int k = 0;         // pointer for temp array

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // copy remaining elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // copy back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}
