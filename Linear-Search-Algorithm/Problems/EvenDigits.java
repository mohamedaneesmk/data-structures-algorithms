public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int result = findEvenDigits(nums);
        System.out.println(result);
    }

    private static int findEvenDigits(int[] nums) {
        int evenDigitsCount = 0;

        for (int num : nums) {
            if (checkDigits(num) % 2 == 0) {
                evenDigitsCount++;
            }
        }

        return evenDigitsCount;
    }

    private static int checkDigits(int num) {
        if (num == 0)
            return 1;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }
}
