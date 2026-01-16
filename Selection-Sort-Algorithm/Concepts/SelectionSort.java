import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 29, 10, 14, 37, 13 };
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element in unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if minimum is not already in position
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}