public class MergeSort {
    private static final int INSERTION_SORT_THRESHOLD = 10;

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (right - left < INSERTION_SORT_THRESHOLD) {
            insertionSort(arr, left, right);
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        // Skip merge if already sorted
        if (arr[mid] <= arr[mid + 1])
            return;

        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copy to temp array
        System.arraycopy(arr, left, temp, left, right - left + 1);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
        // Right half elements are already in place
    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Test method
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90, 88, 45, 50, 23, 36 };

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}