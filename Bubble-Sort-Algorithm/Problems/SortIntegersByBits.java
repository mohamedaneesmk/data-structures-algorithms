import java.util.Arrays;

public class SortIntegersByBits {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] sortedArr = sortByBits(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    private static int[] sortByBits(int[] arr) {
        // Convert array to Integer array for custom sorting
        Integer[] integerArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integerArr[i] = arr[i];
        }

        // Sort using custom comparator
        Arrays.sort(integerArr, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            if (bitCountA != bitCountB) {
                return Integer.compare(bitCountA, bitCountB);
            }
            return Integer.compare(a, b);
        });

        // Convert back to int array
        int[] result = new int[integerArr.length];
        for (int i = 0; i < integerArr.length; i++) {
            result[i] = integerArr[i];
        }

        return result;
    }
}