public class LinearSearchEasy {
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;

        System.out.println(linearSearch(arr, target));
    }
}
