public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2 };
        int result = maxProduct(arr);
        System.out.println("Maximum product of two elements: " + result);
    }

    private static int maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (max < num) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
