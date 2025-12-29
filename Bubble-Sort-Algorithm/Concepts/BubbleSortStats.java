public class BubbleSortStats {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) System.out.print(num + " ");

        System.out.println("\nComparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}
