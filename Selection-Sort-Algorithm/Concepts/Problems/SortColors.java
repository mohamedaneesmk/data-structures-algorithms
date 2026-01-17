public class SortColors {
    public static void main(String[] args) {
        int[] colors = { 2, 0, 2, 1, 1, 0 };
        sortColors(colors);
        System.out.println("Sorted colors: ");
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }

    private static void sortColors(int[] colors) {
        int low = 0;
        int mid = 0;
        int high = colors.length - 1;

        while (mid <= high) {
            switch (colors[mid]) {
                case 0:
                    // Swap with low
                    swap(colors, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap with high
                    swap(colors, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
